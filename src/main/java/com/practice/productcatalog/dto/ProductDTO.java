package com.practice.productcatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

	
		private String name;
		
		private String description;
		
		private double price;
		
		private String category;
		
		private String image;
		
		private int stockQuantity;


		/*
		 * public String getName() { // TODO Auto-generated method stub return name; }
		 * 
		 * public String getDescription() { // TODO Auto-generated method stub return
		 * description; }
		 * 
		 * public double getPrice() { // TODO Auto-generated method stub return price; }
		 * 
		 * public String getCategory() { // TODO Auto-generated method stub return
		 * category; }
		 * 
		 * public String getImage() { // TODO Auto-generated method stub return image; }
		 * 
		 * public int getStockQuantity() { // TODO Auto-generated method stub return
		 * stockQuantity; }
		 */	
	
}
	
	
	

