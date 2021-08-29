package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-20 14:56
 * @Version: v1.0
 */
@Component
@EnableBinding(Sink.class)
@Slf4j
public class ReceiveMessageListenerController {

        @Value("${server.port}")
        private String serverPort;

        @StreamListener(Sink.INPUT)
        public void input(Message<String> message){

                System.out.println("消费者1号，----->接收到的消息： " + message.getPayload() + "\t  post: "+ serverPort);
        }
}
