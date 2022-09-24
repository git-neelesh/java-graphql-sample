package com.example.Graphql.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Order {
    private Long id;
    private Customer customer;
    private Product product;
    private Integer quantity;
    private String status;
    private LocalDate created;
}
