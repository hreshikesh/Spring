package com.xworkz.module.service;

import com.xworkz.module.entity.RegisterEntity;
import com.xworkz.module.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService{
    @Autowired
    RegisterRepository registerRepository;
    @Override
    public boolean save(RegisterEntity entity) {
        return registerRepository.save(entity);
    }

    @Override
    public boolean find(String name, String password) {
       RegisterEntity register= registerRepository.find(name,password);
       if(name.equals(register.getName()) && password.equals(register.getPassword())){
           return true;
       }else return false;
    }
}
