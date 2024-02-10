package com.quickcart.controller;


import com.quickcart.entity.Product;
import com.quickcart.model.SearchRequest;
import com.quickcart.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping("/search")
    public List<Product> searchProducts(@RequestBody SearchRequest searchRequest) {
        return searchService.searchProducts(searchRequest.getQuery());
    }
}

