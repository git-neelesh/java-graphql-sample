package com.example.Graphql.Data;

import com.example.Graphql.Models.CustomerModel;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerModel, Long> {

}
