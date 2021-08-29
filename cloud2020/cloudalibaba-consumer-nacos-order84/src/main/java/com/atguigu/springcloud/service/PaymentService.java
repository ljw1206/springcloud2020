package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-25 21:08
 * @Version: v1.0
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {

        @GetMapping(value="/paymentSQL/{id}")
        public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
