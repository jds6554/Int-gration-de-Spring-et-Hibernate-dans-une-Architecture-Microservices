package com.microservice.product.service;

import com.microservice.product.entity.Product;

import java.util.List;

/**
 * Interface de la couche service métier pour la gestion des produits.
 */
public interface ProductService {
    void addProduct(Product product);
    List<Product> getAllProducts();
}
