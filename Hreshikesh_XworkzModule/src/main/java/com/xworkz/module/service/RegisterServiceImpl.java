package com.xworkz.module.service;

import com.xworkz.module.entity.RegisterEntity;
import com.xworkz.module.repository.RegisterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterRepository registerRepository;
    BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();




    @Override
    public boolean save(RegisterEntity entity) {


        String password = entity.getPassword();
        String encryptedPassword = passwordEncoder.encode(password);

        entity.setPassword(encryptedPassword);

        System.out.println(entity);

        return registerRepository.save(entity);
    }

    @Override
    public boolean find(String name, String password) {
        RegisterEntity register = registerRepository.find(name);
        String retrievedPassword = register.getPassword();

//        System.out.println(decryptedPassword);
        if (name.equals(register.getName()) && passwordEncoder.matches(password,retrievedPassword)) {
            return true;
        } else return false;
    }
}
