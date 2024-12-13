package com.CategoryProductCRUD.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.CategoryProductCRUD.demo.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

