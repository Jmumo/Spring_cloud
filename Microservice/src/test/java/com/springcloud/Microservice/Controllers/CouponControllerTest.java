package com.springcloud.Microservice.Controllers;


import com.google.common.base.Verify;
import com.springcloud.Microservice.Services.CouponService;
import com.springcloud.Microservice.models.Coupon;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.reactivestreams.Publisher;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import javax.swing.text.AbstractDocument;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static reactor.core.publisher.Mono.when;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CouponController.class)
public class CouponControllerTest {
    @MockBean
    CouponService couponService;

    private MockMvc mockMvc;
    @Test
   public void testCouponEndPoint() throws Exception{
        Coupon save = new Coupon(1L,"mumo", 12.0, "5/8/2021");
        Coupon savedCountry = new Coupon(1L,"mumo", 12.0, "5/8/2021");
        Mockito.when(couponService.SaveCoupon(save)).thenReturn(savedCountry);
        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/coupon/coupons1")
               .accept(MediaType.ALL).content(String.valueOf(savedCountry));
       {
           try {
                mockMvc.perform(requestBuilder)
                       .andExpect(status().is(200));
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
   }
//    @Test
//    public void testCouponEndPointget() throws Exception{
//        String code = "mum";
//        Coupon save = new Coupon(1L,"mum", 12.0, "5/8/2021");
//        Mockito.when(couponService.findByCode(code)).thenReturn(save);
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/coupon/coupons/{code}")
//                .param("code",code)
//                .accept(MediaType.ALL).content(String.valueOf(save));
//        {
//            try {
//                mockMvc.perform(requestBuilder).andExpect(status().is(200));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
