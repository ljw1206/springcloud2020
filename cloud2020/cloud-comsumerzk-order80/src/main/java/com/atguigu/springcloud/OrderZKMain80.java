package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-09 23:03
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
        public static void main(String[] args) {
                SpringApplication.run(OrderZKMain80.class, args);
        }
}
