package com.CategoryProductCRUD.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CategoryProductCRUD.demo.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
