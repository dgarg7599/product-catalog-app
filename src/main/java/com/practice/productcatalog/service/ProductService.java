package com.practice.productcatalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.productcatalog.dto.ProductDTO;
import com.practice.productcatalog.model.Product;
import com.practice.productcatalog.repository.ProductRepository;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public Product addProduct(ProductDTO productDto) {
		Product product = new Product(productDto);
		return productRepo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		return productRepo.findById(id).orElseThrow(()-> new RuntimeException("Product not found."));
	}

	@Override
	public Product updateProduct(Long id, ProductDTO productDto) {
		Product existingProduct = getProductById(id);
		existingProduct.setName(productDto.getName());
		existingProduct.setDescription(productDto.getDescription());
		existingProduct.setPrice(productDto.getPrice());
		existingProduct.setCategory(productDto.getCategory());
		existingProduct.setImage(productDto.getImage());
		existingProduct.setStockQuantity(productDto.getStockQuantity());
		return productRepo.save(existingProduct);
	}

	@Override
	public void deleteProduct(Long id) {
		productRepo.deleteById(id);
	}

}
