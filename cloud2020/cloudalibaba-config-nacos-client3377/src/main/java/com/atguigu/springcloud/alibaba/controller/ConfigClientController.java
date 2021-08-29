package com.atguigu.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-22 3:12
 * @Version: v1.0
 */
@RestController
@Slf4j
@RefreshScope//支持Nacos的动态刷新功能，实现配置自动更新
public class ConfigClientController {

        @Value("${config.info}")
        private String configInfo;

        @GetMapping("/config/info")
        public String getConfigInfo() {
                return configInfo;
        }
}
