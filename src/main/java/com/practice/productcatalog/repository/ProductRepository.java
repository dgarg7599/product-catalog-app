package com.practice.productcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.productcatalog.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
