package com.thoughtworks.product.repo;

import com.thoughtworks.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by dharihar on 13/11/2016.
 */
public interface ProductRepo extends JpaRepository<Product, Long>{

    List<Product> findByNameContaining(String nameQuery);
}
