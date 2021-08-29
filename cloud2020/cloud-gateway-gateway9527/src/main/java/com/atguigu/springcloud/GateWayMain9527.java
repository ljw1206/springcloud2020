package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-17 22:06
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
        
        public static void main(String[] args) {
                SpringApplication.run(GateWayMain9527.class, args);
        }
}
