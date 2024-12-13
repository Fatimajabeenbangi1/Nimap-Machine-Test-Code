package com.CategoryProductCRUD.demo.service.Impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.CategoryProductCRUD.demo.Entity.Category;
import com.CategoryProductCRUD.demo.repository.CategoryRepository;
import com.CategoryProductCRUD.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addNewCategory(Category category) {
        // Saving the new category
        return categoryRepository.save(category);
    }

    @Override
    public Page<Category> getAllCategories(int page, int size) {
        // Paging the categories using Spring Data's PageRequest
        return categoryRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
        // Retrieve category by ID, wrapped in Optional
        return categoryRepository.findById(id);
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        // Check if the category exists
        if (categoryRepository.existsById(id)) {
            // Set the ID and save the updated category
            category.setId(id);
            return categoryRepository.save(category);
        }
        // If category doesn't exist, you can throw an exception or return null
        return null;
    }

    @Override
    public void deleteCategory(Long id) {
        // Deleting the category by ID
        categoryRepository.deleteById(id);
    }

    @Override
    public Category createCategory(Category category) {
        // Create or update the category (depends on your implementation, could be similar to addNewCategory)
        return categoryRepository.save(category);
    }
}
