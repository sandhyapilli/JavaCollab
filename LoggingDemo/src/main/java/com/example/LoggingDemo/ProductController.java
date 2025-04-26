package com.example.LoggingDemo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.el.MethodNotFoundException;



@RestController
@RequestMapping("/product")
public class ProductController {
	
	private static final Logger logger=LoggerFactory.getLogger(ProductController.class);
	@Autowired
	private ProductService productService;
//	@PostMapping("/create")
//    public ResponseEntity<ProductDTO> createProduct(@Validated(createGroup.class) @RequestBody Product product){
//	
//		ProductDTO details=productService.createProduct(product);
//		if(details.getPrice()<0 || details.getId()==null) {
//			throw new MethodNotFoundException("It should not be null or negative");
//		}
//		return ResponseEntity.status(HttpStatus.CREATED).body(details);
//	}
	
	@GetMapping("/getById/{id}")
	public Product getById(@PathVariable Integer id) {
	    // Fetch details from the service layer
	    return productService.getDetails(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Product not found with ID: " + id));
	}

	
	@GetMapping("/getAll")
	public ResponseEntity<List<Product>> getAllDetails(Product product){
		logger.info("getting the details");
		List<Product> data=productService.getAllDetails(product);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(data);
	}
	@PutMapping("/update/{id}")
	public Product updateDetails(@PathVariable Integer id, @RequestBody Product product) {
		
	logger.error("can't update");
	
		return productService.updateDetails(product);
	}
}
