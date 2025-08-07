package com.xworkz.hitler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ShoeDto {
    private String type;
    private String origin;
    private String company;
    private String price;
    private String quantity;
}
