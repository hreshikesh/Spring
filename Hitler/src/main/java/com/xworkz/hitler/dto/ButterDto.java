package com.xworkz.hitler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ButterDto {

   private String butterName;
    private String brandName;
    private int price;
    private String butterType;
    private int fatPercentage;
}
