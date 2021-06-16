package com.springcloud.Microservice.Controllers;


import com.springcloud.Microservice.Services.CouponService;
import com.springcloud.Microservice.models.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coupon")
public class CouponController {
    @Autowired
    CouponService couponService;

    @PostMapping("/coupons")
    public Coupon Create(@RequestBody Coupon coupon){
        return couponService.SaveCoupon(coupon);
    }
    @GetMapping("/coupon/{code}")
    public Coupon getCoupon(@PathVariable String code){
        return couponService.findByCode(code);
    }

}
