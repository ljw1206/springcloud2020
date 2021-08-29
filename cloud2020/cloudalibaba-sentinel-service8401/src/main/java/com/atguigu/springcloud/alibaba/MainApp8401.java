package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-24 14:32
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApp8401 {
        public static void main(String[] args) {
                SpringApplication.run(MainApp8401.class, args);
        }
}
