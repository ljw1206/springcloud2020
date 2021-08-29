package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-17 1:51
 * @Version: v1.0
 */
@SpringBootApplication
@EnableHystrixDashboard //开启hystrix监控仪表盘功能
public class HystrixDashboardMain9001 {
        public static void main(String[] args) {
                SpringApplication.run(HystrixDashboardMain9001.class, args);
        }
}
