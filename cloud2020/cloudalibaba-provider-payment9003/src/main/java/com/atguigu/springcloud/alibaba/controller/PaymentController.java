package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-25 2:44
 * @Version: v1.0
 */
@RestController
public class PaymentController {

        @Value("${server.port}")
        private String serverPort;

        public static HashMap<Long, Payment> hashMap = new HashMap<>();
        static {
                hashMap.put(1L,new Payment(1L,"asd434sfdsafdwsiuj4534"));
                hashMap.put(2L,new Payment(2L,"sdf12asd2sad311321sad3"));
                hashMap.put(3L,new Payment(3L,"fg4fd424dse2ggv2x2s4t4"));
        }

        @GetMapping(value="/paymentSQL/{id}")
        public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
                Payment payment = hashMap.get(id);
                CommonResult<Payment> result = new CommonResult(200,"from mysql,serverPort:  "+serverPort,payment);
                return result;
        }
}
