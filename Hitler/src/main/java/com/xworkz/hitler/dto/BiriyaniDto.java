package com.xworkz.hitler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BiriyaniDto {
    private String biriyaniName;
    private String hotelName;
    private int price;
    private String biriyaniType;
    private int rating;

}
