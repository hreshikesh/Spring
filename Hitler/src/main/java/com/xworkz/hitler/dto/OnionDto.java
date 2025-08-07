package com.xworkz.hitler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OnionDto {
    private String type;
    private String origin;
    private String company;
    private int price;
    private int quantity;

}
