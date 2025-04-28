package com.practice.productcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.productcatalog.dto.ProductDTO;
import com.practice.productcatalog.model.Product;
import com.practice.productcatalog.dto.ResponseDTO;
import com.practice.productcatalog.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private IProductService productService;

	@GetMapping("/hello")
	public String sayHelllo() {
		return "Hello World!";
	}
	
	@PostMapping("/add")
	public ResponseEntity<ResponseDTO> addProduct(@RequestBody ProductDTO productDto){
		Product product = productService.addProduct(productDto);
		ResponseDTO response = new ResponseDTO("Product added successfully.", product);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<ResponseDTO> getAllProducts(){
		List<Product> products = productService.getAllProducts();
		ResponseDTO response = new ResponseDTO("List of all Products.", products);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseDTO> getProductById(@PathVariable Long id){
		Product product = productService.getProductById(id);
		ResponseDTO response = new ResponseDTO("Product Found.", product);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ResponseDTO> updateProductById(@PathVariable Long id, @RequestBody ProductDTO productDto){
		Product product = productService.updateProduct(id, productDto);
		ResponseDTO response = new ResponseDTO("Product updated successfully.", product);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ResponseDTO> deleteProductById(@PathVariable Long id){
		productService.deleteProduct(id);
		ResponseDTO response = new ResponseDTO("Product deleted successfully.", id);
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
}
