package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 支付接口
 * @Author: Jeke Liang
 * @Date: 2021-08-07 17:29
 * @Version: v1.0
 */
public interface PaymentService {

        public int create(Payment payment);

        public Payment getPaymentById(@Param("id") Long id);
}
