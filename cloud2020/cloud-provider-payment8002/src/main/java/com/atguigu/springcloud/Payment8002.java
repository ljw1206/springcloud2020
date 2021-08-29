package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: 支付服务提供者8001
 * @Author: Liangjw
 * @Date: 2021年8月7日00:31:40
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Payment8002 {
        public static void main(String[] args) {
                SpringApplication.run(Payment8002.class, args);
        }
}
