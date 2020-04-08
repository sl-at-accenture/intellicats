package com.accenture.js.intellicats.shop.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.js.intellicats.shop.dtos.ProductDto;
import com.accenture.js.intellicats.shop.models.Product;
import com.accenture.js.intellicats.shop.repositories.ProductRepository;

@RestController
public class ProductController {
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> readAllProducts (){
		return productRepository.findAll();
	}
    
	@GetMapping("/products/{id}")
	public ResponseEntity<ProductDto> findByID(@PathVariable("id")Long id) {
		
		Optional<Product> byId = productRepository.findById(id);
		if(byId.isPresent()) {
			ProductDto productDto = new ProductDto();
			productDto.setEan(byId.get().getEan());
			productDto.setPrice(byId.get().getPrice());
			productDto.setTitle(byId.get().getName());
			
			return ResponseEntity.ok(productDto);
		}
		return new ResponseEntity<ProductDto>(HttpStatus.NOT_FOUND);
	}

	
	@PostMapping("/products")
	public Product insertProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
}
