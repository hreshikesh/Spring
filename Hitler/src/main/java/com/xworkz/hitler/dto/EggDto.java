package com.xworkz.hitler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EggDto {
    private String eggType;
    private String source;
    private int price;
    private String size;
    private int proteinContent;
}
