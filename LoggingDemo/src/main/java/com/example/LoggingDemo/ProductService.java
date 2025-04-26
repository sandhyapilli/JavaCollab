package com.example.LoggingDemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
  
    	    // Convert DTO to entity and save
//    	    public ProductDTO createProduct(ProductDTO productDTO) {
//    	        // Convert DTO to Entity
//    	        Product product = new Product();
//    	        product.setId(productDTO.getId());
//    	        product.setName(productDTO.getName());
//    	        product.setPrice(productDTO.getPrice());
//
//    	        // Save to the database
//    	        product = productRepo.save(product);
//
//    	        // Convert entity back to DTO
//    	        ProductDTO savedProductDTO = new ProductDTO();
//    	        savedProductDTO.setId(product.getId());
//    	        savedProductDTO.setName(product.getName());
//    	        savedProductDTO.setPrice(product.getPrice());
//
//    	        return savedProductDTO;
//    	    }
    	

    
    public Optional<Product> getDetails(Integer id) {
    	return productRepo.findById(id);
    }
    
    public List<Product> getAllDetails(Product product) {
    	return productRepo.findAll();
    }
    
    public Product updateDetails(Product product) {
    	
    	return productRepo.save(product);
    }
}
