package com.xworkz.hitler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SockDto {
    private String sockName;
    private String sockBrand;
    private int sockPrice;
    private String sockShop;
    private String sockMaterial;
}
