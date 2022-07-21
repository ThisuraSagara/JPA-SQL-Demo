package com.javajap.japsqldemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ProductDtoGet {


    private int id;
    private String name;
    private double price;
}
