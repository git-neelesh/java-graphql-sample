package com.example.Graphql.GraphQLQueryResolver;

import com.example.Graphql.Data.CustomerRepository;
import com.example.Graphql.Data.ProductRepository;
import com.example.Graphql.Models.CustomerModel;
import com.example.Graphql.Models.ProductModel;
import com.example.Graphql.entity.Customer;
import com.example.Graphql.entity.Order;
import com.example.Graphql.entity.Product;
import graphql.kickstart.tools.GraphQLQueryResolver;

public class OrderResolver implements GraphQLQueryResolver {
    private ProductRepository productRepository;
    private CustomerRepository customerRepository;

    public OrderResolver(ProductRepository productRepository, CustomerRepository customerRepository) {
        this.productRepository = productRepository;
        this.customerRepository = customerRepository;
    }

    public Customer customer(Order order) {
        return customerRepository.findById(order.getCustomer().getId())
                .map(this::modelToGraphQL)
                .orElse(null);
    }

    public Product product(Order order) {
        return productRepository.findById(order.getProduct().getId())
                .map(this::modelToGraphQL)
                .orElse(null);
    }

    private Product modelToGraphQL(ProductModel productModel) {
        Product product = new Product();
        product.setDescription(productModel.getDescription());
        product.setName(productModel.getName());
        product.setId(productModel.getId());
        product.setPrice(productModel.getPrice());
        return product;
    }

    private Customer modelToGraphQL(CustomerModel customerModel) {
        Customer customer = new Customer();
        customer.setEmail(customerModel.getEmail());
        customer.setId(customerModel.getId());
        customer.setName(customerModel.getName());
        return customer;
    }

}
