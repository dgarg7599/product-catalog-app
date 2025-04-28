package com.practice.productcatalog.service;

import java.util.List;

import com.practice.productcatalog.dto.ProductDTO;
import com.practice.productcatalog.model.Product;

public interface IProductService  {
	
	Product addProduct(ProductDTO productDto);
	List<Product> getAllProducts();
	Product getProductById(Long id);
	Product updateProduct(Long id, ProductDTO productDto);
	void deleteProduct(Long id);
}
