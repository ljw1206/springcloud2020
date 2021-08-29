package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-25 2:42
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9003 {
        public static void main(String[] args) {
                SpringApplication.run(PaymentMain9003.class, args);
        }
}
