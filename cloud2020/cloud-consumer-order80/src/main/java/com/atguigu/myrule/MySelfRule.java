package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-12 21:57
 * @Version: v1.0
 */
@Configuration
public class MySelfRule {

        @Bean
        public IRule myRule(){
                return new RandomRule();  //自定义为随机的负载均衡算法
        }
}
