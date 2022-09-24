package com.example.Graphql.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Customer {
    private Long id;
    private String name;
    private String email;
    private List<Order> orders;
}
