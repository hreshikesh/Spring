package com.xworkz.module.service;

import com.xworkz.module.entity.RegisterEntity;

public interface RegisterService {

    boolean save(RegisterEntity entity);

    boolean find(String name,String password);
}
