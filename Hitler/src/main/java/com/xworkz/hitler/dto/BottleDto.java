package com.xworkz.hitler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BottleDto {
    private String bottleName;
    private String brandName;
    private int price;
    private String material;
    private int capacity;
}
