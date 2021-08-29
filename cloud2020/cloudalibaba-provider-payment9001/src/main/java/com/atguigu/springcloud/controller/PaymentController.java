package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-21 23:28
 * @Version: v1.0
 */
@RestController
public class PaymentController {

        @Value("${server.port}")
        private String serverPort;

        @GetMapping(value = "/payment/nacos/get/{id}")
        public String getPayment(@PathVariable("id") Integer id){
                return "nacos registry, serverPort" + serverPort + "\t id: " + id;
        }
}
