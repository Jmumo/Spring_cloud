package com.product.ProductService.ProductController;

import com.product.ProductService.Models.Product;
import com.product.ProductService.ProductSer.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;
   @PostMapping("/product")
    public Product create(@RequestBody Product product){
        return productService.save(product);
    }
}
