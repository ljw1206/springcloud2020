package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ApplicationContextConfig
 * @description: 配置类
 * @author: XZQ
 * @create: 2020/3/5 21:25
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    //用自己写的负载均衡算法，就要把这个@LoadBalanced注释掉
    //@LoadBalanced //使用@LoadBalanced注解，赋予了RestTemplate负载均衡的能力（默认轮训负载算法）
    public RestTemplate getRestTemplate() {
            return new RestTemplate();
    }
}
