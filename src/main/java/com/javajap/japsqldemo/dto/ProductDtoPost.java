package com.javajap.japsqldemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class ProductDtoPost {

    @NotNull
    private String name;

    @NotNull
    private int quantity;

    @NotNull
    private double price;

    @NotNull
    @Email
    private String email;
}
