package com.practice.productcatalog.model;

import com.practice.productcatalog.dto.ProductDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	private String name;
	
	private String description;
	
	private double price;
	
	private String category;
	
	private String image;
	
	private int stockQuantity;
	
	public Product(ProductDTO productDto) {
		this.updateProduct(productDto);
	}
	
	public void updateProduct(ProductDTO productDto) {
		this.name = productDto.getName();
		this.description = productDto.getDescription();
		this.price = productDto.getPrice();
		this.category = productDto.getCategory();
		this.image = productDto.getImage();
		this.stockQuantity = productDto.getStockQuantity();
		
	}

}
