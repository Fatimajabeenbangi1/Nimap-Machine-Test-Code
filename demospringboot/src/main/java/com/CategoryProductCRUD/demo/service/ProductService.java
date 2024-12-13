package com.CategoryProductCRUD.demo.service;

import org.springframework.data.domain.Page;

import com.CategoryProductCRUD.demo.Entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product addNewProduct(Product product);

    Page<Product> getAllProducts(int i, int j);

    Optional<Product> getProductById(Long id);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);

	Product saveProduct(Product product);

	Product createProduct(Product product);
}
