package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-09 23:07
 * @Version: v1.0
 */
@Configuration
public class ApplicationContextConfig {

        @Bean
        @LoadBalanced
        public RestTemplate getRestTemplate(){
                return new RestTemplate();
        }
}
