package com.xworkz.module.service;


import com.xworkz.module.dto.RegisterDto;

public interface RegisterService {

    boolean save(RegisterDto dto);

    boolean find(String name,String password);
}
