package com.xworkz.hitler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChutneyDto {
    private String chutneyName;
    private String color;
    private int price;
    private String taste;
    private String spiceLevel;
}
