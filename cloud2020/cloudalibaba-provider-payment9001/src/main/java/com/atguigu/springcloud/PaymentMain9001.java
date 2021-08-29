package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-21 23:19
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9001 {
        public static void main(String[] args) {
                SpringApplication.run(PaymentMain9001.class, args);
        }
}
