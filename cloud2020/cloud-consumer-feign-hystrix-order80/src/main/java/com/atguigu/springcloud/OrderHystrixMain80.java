package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-15 17:17
 * @Version: v1.0
 */
@SpringBootApplication
@EnableFeignClients //开启（激活）openfeign功能
@EnableHystrix //开启Hystrix
public class OrderHystrixMain80 {
        public static void main(String[] args) {
                SpringApplication.run(OrderHystrixMain80.class, args);
        }
}
