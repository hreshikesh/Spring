package com.xworkz.hitler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChappalDto {
   private String chappalName;
    private String brandName;
    private int price;
    private String chappalType;
    private int size;
}
