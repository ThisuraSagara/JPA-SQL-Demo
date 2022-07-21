package com.javajap.japsqldemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {

    @Id
    @GeneratedValue
    @NotNull
    private int id;

    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date createdDate = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date updatedDate = new Date();

    @NotNull
    private String name;

    @Email
    @NotNull
    private String email;

    @NotNull
    private int quantity;

    @NotNull
    private double price;

}
