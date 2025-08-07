package com.xworkz.hitler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParotaDto {
    private String type;
    private String origin;
    private String company;
    private String price;
    private String quantity;
}
