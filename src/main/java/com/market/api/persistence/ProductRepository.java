package com.market.api.persistence;

import com.market.api.persistence.crud.ProductCrudRepository;
import com.market.api.persistence.entity.Product;

import java.util.List;

public class ProductRepository {
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAllProducts(){
        return (List<Product>) productCrudRepository.findAll();
    }
}
