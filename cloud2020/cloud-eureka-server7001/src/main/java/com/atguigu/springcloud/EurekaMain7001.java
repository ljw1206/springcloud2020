package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: 服务注册中心 单机版
 * @Author: Jeke Liang
 * @Date: 2021-08-08 13:54
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
        public static void main(String[] args) {
                SpringApplication.run(EurekaMain7001.class, args);
        }
}
