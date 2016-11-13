package com.thoughtworks.product.service;

import com.thoughtworks.product.model.Product;
import com.thoughtworks.product.repo.ProductRepo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dharihar on 13/11/2016.
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getProducts(String nameQuery) {
        if (StringUtils.isBlank(nameQuery)) {
            return productRepo.findAll();
        }
        return productRepo.findByNameContaining(nameQuery);
    }

    public Product getProductById(long id) {
        return productRepo.findOne(id);
    }

    public void saveNewProduct(Product product) {
        productRepo.save(product);
    }
}
