package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Description: 订单主启动类
 * @Author: Jeke Liang
 * @Date: 2021-08-07 23:38
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //开启服务发现功能，获取微服务IP地址、端口和服务名称等信息
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration= MySelfRule.class)
public class OrderMain80 {
        public static void main(String[] args) {
                SpringApplication.run(OrderMain80.class, args);
        }
}
