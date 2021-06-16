package com.product.ProductService.ProductRepo;

import com.product.ProductService.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
