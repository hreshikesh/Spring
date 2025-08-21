package com.xworkz.module.service;

import com.xworkz.module.dto.RegisterDto;
import com.xworkz.module.entity.RegisterEntity;
import com.xworkz.module.repository.RegisterRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

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
        RegisterEntity register = registerRepository.find(name);
        String retrievedPassword = register.getPassword();
        if(register.getName()!=null && passwordEncoder.matches(password, retrievedPassword)){
            BeanUtils.copyProperties(register,registerDto);
            registerDto.setPassword(register.getPassword());
            return registerDto;
        }
        return null;
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
       if(update){
           getEmail(fetchedEmail,"Password Changed","Dear User"+"\n\nPassword For your account was changed");
       }
        return update;
    }

    @Override
    public RegisterDto updateProfile(RegisterDto dto) {
        RegisterEntity register=new RegisterEntity();
        register.setName(dto.getName());
        register.setEmail(dto.getEmail());
        register.setPhone(dto.getPhone());
        register.setAge(dto.getAge());
        register.setAddress(dto.getAddress());
        register.setPassword(passwordEncoder.encode(dto.getPassword()));
        RegisterDto dto1=new RegisterDto();

        register= registerRepository.updateProfile(register);
        BeanUtils.copyProperties(register,dto1);
        return dto1;

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
