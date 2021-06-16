package com.springcloud.Microservice.Services;

import com.springcloud.Microservice.Repos.CouponRepository;
import com.springcloud.Microservice.models.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;
    public Coupon SaveCoupon(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    public Coupon findByCode(String code) {
        return couponRepository.findByCode(code);
    }
}
