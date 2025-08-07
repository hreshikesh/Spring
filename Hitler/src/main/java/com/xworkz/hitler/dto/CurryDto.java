package com.xworkz.hitler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurryDto {
    private String curryName;
    private String mainIngredient;
    private int price;
    private String curryType;
    private int servingCount;
}
