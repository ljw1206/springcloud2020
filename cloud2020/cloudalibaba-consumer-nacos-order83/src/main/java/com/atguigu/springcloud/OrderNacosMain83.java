package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-22 0:21
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83 {
        public static void main(String[] args) {
                SpringApplication.run(OrderNacosMain83.class, args);
        }
}
