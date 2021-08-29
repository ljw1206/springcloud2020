package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-10 23:13
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient  //该注解用于向consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8006 {
        public static void main(String[] args) {
                SpringApplication.run(PaymentMain8006.class, args);
        }
}
