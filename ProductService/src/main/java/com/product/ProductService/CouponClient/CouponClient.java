package com.product.ProductService.CouponClient;

import com.product.ProductService.dto.Coupon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("GATEWAY-SERVICE")
public interface CouponClient {
    @GetMapping("/coupon/coupon/{code}")
    Coupon getCoupon(@PathVariable("code") String code);
}
