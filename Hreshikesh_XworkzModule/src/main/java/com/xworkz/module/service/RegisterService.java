package com.xworkz.module.service;


import com.xworkz.module.dto.ContactDto;
import com.xworkz.module.dto.RegisterDto;
import com.xworkz.module.entity.RegisterEntity;

public interface RegisterService {

    boolean save(RegisterDto dto);

    RegisterDto find(String name, String password);

    RegisterDto findByEmail(String email);

    boolean updatePassword(String password);

    boolean updateProfile(ContactDto dto);
}
