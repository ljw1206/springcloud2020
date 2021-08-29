package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-20 13:00
 * @Version: v1.0
 */
@RestController
@Slf4j
public class SendMessageController {

        @Resource
        private IMessageProvider messageProvider;

        @GetMapping(value="/sendMessage")
        public String sendMessage(){
                return messageProvider.send();
        }

}
