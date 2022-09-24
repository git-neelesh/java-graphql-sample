package com.example.Graphql.Data;

import com.example.Graphql.Models.OrderModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<OrderModel, Long> {
    List<OrderModel> findByCustomerId(Long customerId);
}