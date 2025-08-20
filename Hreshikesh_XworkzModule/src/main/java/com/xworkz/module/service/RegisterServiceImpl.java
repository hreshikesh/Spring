package com.xworkz.module.service;

import com.xworkz.module.dto.RegisterDto;
import com.xworkz.module.entity.RegisterEntity;
import com.xworkz.module.repository.RegisterRepository;

import org.springframework.beans.factory.annotation.Autowired;
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
        getEmail(registerEntity.getEmail());//email integration
        registerEntity.setAddress(registerDto.getAddress());
        registerEntity.setGender(registerDto.getGender());
        registerEntity.setPhone(registerDto.getPhone());
        registerEntity.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        return registerRepository.save(registerEntity);
    }

    private void getEmail(String email){


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
            message.setSubject("Register Successful");
            message.setText("Dear User,"
                    + "\n\n Your registration for xworkz is sucessfull");

            Transport.send(message);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    @Override
    public boolean find(String name, String password) {
        RegisterEntity register = registerRepository.find(name);
        String retrievedPassword = register.getPassword();
        if (name.equals(register.getName()) && passwordEncoder.matches(password,retrievedPassword)) {
            return true;
        } else return false;
    }
}
