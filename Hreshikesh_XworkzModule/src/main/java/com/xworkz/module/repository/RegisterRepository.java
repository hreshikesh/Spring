package com.xworkz.module.repository;

import com.xworkz.module.entity.RegisterEntity;

import java.util.List;

public interface RegisterRepository {
    boolean save(RegisterEntity entity);

    RegisterEntity find(String name);

    RegisterEntity findByEmail(String email);

    boolean updatePassword(String email,String password);

    boolean updateProfile(RegisterEntity register);

    void updateTable(RegisterEntity entity);

    Long countEmail(String email);

    List<String> checkPassword(String password);
}
