package com.thoughtworks.product.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dharihar on 13/11/2016.
 */
@Data
@Entity
@Table(name = "Products")
public class Product {
    @Id
    private long id;
    private String name;
    private String description;
}
