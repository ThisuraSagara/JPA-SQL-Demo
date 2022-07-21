package com.javajap.japsqldemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ProductDtoPost {

    private String name;
    private int quantity;
    private double price;
}
