package com.CategoryProductCRUD.demo.service;

import org.springframework.data.domain.Page;

import com.CategoryProductCRUD.demo.Entity.Category;

import java.util.Optional;

public interface CategoryService {

    Category addNewCategory(Category category);

    Page<Category> getAllCategories(int page, int size);

    Optional<Category> getCategoryById(Long id);

    Category updateCategory(Long id, Category category);

    void deleteCategory(Long id);

	Category createCategory(Category category);
}



