package com.xworkz.module.service;

import com.xworkz.module.dto.UpdateDto;
import com.xworkz.module.dto.RegisterDto;
import com.xworkz.module.entity.RegisterEntity;
import com.xworkz.module.repository.RegisterRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.Random;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterRepository registerRepository;
    BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
    @Override
    public boolean save(RegisterDto registerDto) {
        RegisterEntity registerEntity=new RegisterEntity();
        registerEntity.setName(registerDto.getName());
        registerEntity.setAge(registerDto.getAge());
        registerEntity.setEmail(registerDto.getEmail());
        getEmail(registerEntity.getEmail(),"Register Successful","Dear User," + "\n\n Your registration for xworkz is sucessfull");//email integration
        registerEntity.setAddress(registerDto.getAddress());
        registerEntity.setGender(registerDto.getGender());
        registerEntity.setPhone(registerDto.getPhone());
        registerEntity.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        return registerRepository.save(registerEntity);
    }


    @Override
    public RegisterDto find(String name, String password) {
        RegisterDto registerDto=new RegisterDto();
        LocalDateTime localDateTime=LocalDateTime.now();

        RegisterEntity entity = registerRepository.find(name);
        if(entity==null){
            registerDto.setName("notfound");
            return registerDto;
        }
        else {
            if (entity.getLoginAttempt()>=3 ) {
                if(localDateTime.isAfter(entity.getLocalDateTime())){
                    RegisterDto dto = new RegisterDto();
                    dto.setName("TimeOut");
                    return dto;
                }else{
                    RegisterDto dto = new RegisterDto();
                    dto.setName("Locked");
                    getEmail(entity.getEmail(), "Account Status","Dear "+entity.getName()+"\n\nYour account has been Blocked for 24hrs .Please reset the password after 24hrs");
                    return dto;
                }
            }
            else {
                if (passwordEncoder.matches(password, entity.getPassword())) {
                    BeanUtils.copyProperties(entity, registerDto);
                    entity.setLoginAttempt(0);
                    entity.setLocalDateTime(null);
                    return registerDto;
                } else {
                    int trails = entity.getLoginAttempt() + 1;
                    entity.setLocalDateTime(localDateTime);
                    entity.setLoginAttempt(trails);
                    if(entity.getLoginAttempt()>=3){
                        entity.setLocalDateTime(entity.getLocalDateTime().plusDays(1));
                    }
                }
            }
            registerRepository.updateTable(entity);
            return null;
        }
    }
    String fetchedEmail="";
    @Override
    public RegisterDto findByEmail(String email) {
        RegisterEntity register=registerRepository.findByEmail(email);
        System.out.println(register);
        RegisterDto registerDto=new RegisterDto();
        BeanUtils.copyProperties(register,registerDto);
        System.out.println(registerDto);
        fetchedEmail= registerDto.getEmail();
       return registerDto;
    }
    @Override
    public boolean updatePassword(String password) {
       boolean update=registerRepository.updatePassword(fetchedEmail,passwordEncoder.encode(password));

           getEmail(fetchedEmail,"Password Changed","Dear User"+"\n\nPassword For your account was changed");

        return update;
    }

    @Override
    public boolean updateProfile(UpdateDto dto) {
        RegisterEntity register=new RegisterEntity();
        register.setName(dto.getName());
        register.setEmail(dto.getEmail());
        register.setPhone(dto.getPhone());
        register.setAge(dto.getAge());
        register.setAddress(dto.getAddress());

        return registerRepository.updateProfile(register);


    }



    private void getEmail(String email,String subject,String body){


        final String username = "ailhreshikesh@gmail.com";
        final String password = "mfbl tuzg xjsl zilu";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email)
            );
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }



}
