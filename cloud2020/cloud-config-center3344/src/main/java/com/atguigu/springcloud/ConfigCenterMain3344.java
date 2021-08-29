package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-19 0:46
 * @Version: v1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
        public static void main(String[] args) {
                SpringApplication.run(ConfigCenterMain3344.class, args);
        }
}
