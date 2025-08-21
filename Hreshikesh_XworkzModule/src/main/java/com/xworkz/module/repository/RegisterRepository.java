package com.xworkz.module.repository;

import com.xworkz.module.entity.RegisterEntity;

public interface RegisterRepository {
    boolean save(RegisterEntity entity);

    RegisterEntity find(String name);

    RegisterEntity findByEmail(String email);

    boolean updatePassword(String email,String password);

    RegisterEntity updateProfile(RegisterEntity register);
}
