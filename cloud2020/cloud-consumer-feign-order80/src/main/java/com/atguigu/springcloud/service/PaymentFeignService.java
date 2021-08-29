package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-14 21:21
 * @Version: v1.0
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
        @GetMapping("/payment/get/{id}")
        public CommonResult getPaymentById(@PathVariable("id") Long id);

        @GetMapping(value="/payment/feign/timeout")
        public String paymentFeignTimeout();
}
