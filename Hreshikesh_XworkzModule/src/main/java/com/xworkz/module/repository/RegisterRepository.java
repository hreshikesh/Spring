package com.xworkz.module.repository;

import com.xworkz.module.entity.RegisterEntity;

public interface RegisterRepository {
    boolean save(RegisterEntity entity);
    RegisterEntity find(String name,String password);
}
