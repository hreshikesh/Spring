package com.xworkz.hitler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MilkDto {
    private String milkType;
    private String source;
    private String company;
    private int price;
    private int quantity;
}
