package com.xworkz.module.service;


import com.xworkz.module.dto.UpdateDto;
import com.xworkz.module.dto.RegisterDto;

public interface RegisterService {

    boolean save(RegisterDto dto);

    RegisterDto find(String name, String password);

    RegisterDto findByEmail(String email);

    boolean updatePassword(String password);

    boolean updateProfile(UpdateDto dto);

    void sendOtp(String email);

    boolean verifyOtp(String otp);

    int countByEmail(String email);

    boolean passwordValidate(String passworrd);


}
