package com.product.ProductService.ProductSer;

import com.product.ProductService.CouponClient.CouponClient;
import com.product.ProductService.Models.Product;
import com.product.ProductService.ProductRepo.ProductRepo;
import com.product.ProductService.dto.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
   private ProductRepo productRepo;

    @Autowired
    CouponClient couponClient;

    public Product save(Product product) {
        Coupon coupon =couponClient.getCoupon(product.getCouponCode());
        product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
       return productRepo.save(product);
    }
}
