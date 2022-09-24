package com.example.Graphql.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "products")
@Setter
@Getter
public class ProductModel {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private Double price;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductModel productModel = (ProductModel) o;
        return Objects.equals(id, productModel.id) &&
                Objects.equals(name, productModel.name) &&
                Objects.equals(description, productModel.description) &&
                Objects.equals(price, productModel.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price);
    }

}