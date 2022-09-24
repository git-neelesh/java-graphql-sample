package com.example.Graphql.Data;

import com.example.Graphql.Models.OrderModel;
import com.example.Graphql.Models.ProductModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductModel, Long> {

}