package com.springcloud.Microservice.Repos;

import com.springcloud.Microservice.models.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon , Long> {

    Coupon findByCode(String code);
}
