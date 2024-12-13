package com.CategoryProductCRUD.demo.service.Impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.CategoryProductCRUD.demo.Entity.Product;
import com.CategoryProductCRUD.demo.repository.CategoryRepository;
import com.CategoryProductCRUD.demo.repository.ProductRepository;
import com.CategoryProductCRUD.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Product addNewProduct(Product product) {
        // Saving the new product
        return productRepository.save(product);
    }

    @Override
    public Page<Product> getAllProducts(int page, int size) {
        // Paging the products using Spring Data's PageRequest
        return productRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        // Retrieve product by ID, wrapped in Optional
        return productRepository.findById(id);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        // Check if the product exists
        if (productRepository.existsById(id)) {
            // Set the ID and save the updated product
            product.setId(id);
            return productRepository.save(product);
        }
        // If product doesn't exist, you can throw an exception or return null
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        // Deleting the product by ID
        productRepository.deleteById(id);
    }

    // Implementing createProduct (it was missing)
    @Override
    public Product createProduct(Product product) {
        // You can add additional logic here, like category validation
        return productRepository.save(product);
    }

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}
}
