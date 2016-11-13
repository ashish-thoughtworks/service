package com.thoughtworks.product.controller;

import com.google.common.collect.ImmutableMap;
import com.thoughtworks.product.model.Product;
import com.thoughtworks.product.service.ProductService;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by dharihar on 13/11/2016.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public List<Product> getProducts(@RequestParam(required = false, name = "name") String nameQuery) {
        return productService.getProducts(nameQuery);
    }

    @RequestMapping("/:id")
    public Product getProductById(@PathVariable long id) {
        return productService.getProductById(id);
    }

    @RequestMapping(name = "", method = RequestMethod.POST)
    public Map<String, Boolean> saveProduct(@RequestBody Product product) {
        productService.saveNewProduct(product);
        return ImmutableMap.of("Success", true);
    }

}
