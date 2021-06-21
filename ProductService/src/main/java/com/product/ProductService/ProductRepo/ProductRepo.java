package com.product.ProductService.ProductRepo;

import com.product.ProductService.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepo extends JpaRepository<Product, Long> {

//    Product findByName(String name);
//
//    @Query("SELECT * FROM USER")
//    Product selectAll();


}
