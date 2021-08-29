package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-22 3:10
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
        public static void main(String[] args) {
                SpringApplication.run(NacosConfigClientMain3377.class, args);
        }
}
