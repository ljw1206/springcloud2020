package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-19 2:30
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {
        public static void main(String[] args) {
                SpringApplication.run(ConfigClientMain3366.class, args);
        }
}
