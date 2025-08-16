package com.xworkz.module.service;

import com.xworkz.module.entity.RegisterEntity;
import com.xworkz.module.repository.RegisterRepository;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterRepository registerRepository;


    BasicTextEncryptor basicTextEncryptor;

    public RegisterServiceImpl() {
        basicTextEncryptor = new BasicTextEncryptor();
        basicTextEncryptor.setPassword("RishiKey");
    }


    @Override
    public boolean save(RegisterEntity entity) {


        String password = entity.getPassword();
        String encryptedPassword = basicTextEncryptor.encrypt(password);

        entity.setPassword(encryptedPassword);

        System.out.println(entity);

        return registerRepository.save(entity);
    }

    @Override
    public boolean find(String name, String password) {
        RegisterEntity register = registerRepository.find(name);
        String retrievedPassword = register.getPassword();
        String decryptedPassword = basicTextEncryptor.decrypt(retrievedPassword);
        System.out.println(decryptedPassword);
        if (name.equals(register.getName()) && password.equals(decryptedPassword)) {
            return true;
        } else return false;
    }
}
