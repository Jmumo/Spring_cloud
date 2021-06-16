package com.product.ProductService.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Coupon {
    private Long Id;
    private String code;
    private BigDecimal discount;
    private Date expdate;
}
