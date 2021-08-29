package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description: 使用openfeign组件的order消费者
 * @Author: Jeke Liang
 * @Date: 2021-08-14 21:07
 * @Version: v1.0
 */
@SpringBootApplication
@EnableFeignClients //开启（激活）openfeign功能
public class OrderFeignMain80 {
        public static void main(String[] args) {
                SpringApplication.run(OrderFeignMain80.class, args);
        }
}
