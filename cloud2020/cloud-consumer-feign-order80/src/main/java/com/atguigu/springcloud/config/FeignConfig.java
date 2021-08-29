package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 配置日志bean
 * @Author: Jeke Liang
 * @Date: 2021-08-14 23:33
 * @Version: v1.0
 */
@Configuration
public class FeignConfig {

        @Bean
        Logger.Level feignLoggerLevel(){
                return Logger.Level.FULL;
        }
}
