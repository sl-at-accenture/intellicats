package com.accenture.js.intellicats.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.js.intellicats.shop.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
