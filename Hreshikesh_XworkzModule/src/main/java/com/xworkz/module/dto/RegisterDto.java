package com.xworkz.module.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {
    @NotNull
    @Size(min = 3, max = 10, message = "Name Should Be Between 3 and 10")
    private String name;
    @NotNull
    @Pattern(regexp = "^[A-Za-z0-9]+@gmail\\.com$", message = "Email not Matching")
    private String email;
    @NotNull(message = "Phone number is required")
    @Min(value = 1000000000L, message = "Phone number must be 10 digits")
    @Max(value = 9999999999L, message = "Phone number must be 10 digits")
    private Long phone;
    @NotNull
    @Min(15)
    @Max(50)
    private Integer age;
    @NotNull(message = "gender should not be empty")
    private String gender;
    @NotNull(message = "Address should be empty")
    private String address;
    @NotNull
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[^A-Za-z0-9])(?=(.*\\d){3,}).{3,15}$", message = "password should match")
    private String password;
}
