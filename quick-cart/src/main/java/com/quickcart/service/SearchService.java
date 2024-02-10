package com.quickcart.service;

import com.quickcart.entity.Product;
import com.quickcart.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> searchProducts(String query) {
        // Implement search logic here, e.g., querying a database or Elasticsearch
        // Dummy implementation for demonstration
        return productRepository.findByNameContainingOrDescriptionContaining(query, query);
    }
}

