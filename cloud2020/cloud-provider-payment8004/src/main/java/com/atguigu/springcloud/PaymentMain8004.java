package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: 支付服务8004主启动类
 * @Author: Jeke Liang
 * @Date: 2021-08-09 4:16
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8004 {
        public static void main(String[] args) {
                SpringApplication.run(PaymentMain8004.class, args);
        }
}
