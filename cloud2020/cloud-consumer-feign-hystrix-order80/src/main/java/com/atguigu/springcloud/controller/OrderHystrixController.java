package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-15 17:29
 * @Version: v1.0
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {

        @Resource
        private PaymentHystrixService paymentHystrixService;


        @GetMapping("/payment/hystrix/ok/{id}")
        public String paymentInfo_OK(@PathVariable("id") Integer id){
                return paymentHystrixService.paymentInfo_OK(id);
        }

        /*@GetMapping("/payment/hystrix/timeout/{id}")
        public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
                return paymentHystrixService.paymentInfo_TimeOut(id);
        }*/

        /**
         * 超时访问
         * * HystrixCommand:一旦自己调用失败并抛出了错误信息后,会自动调用@HystrixCommand标注好的fallbckMethod调用类中的指定方法
         * * execution.isolation.thread.timeoutInMilliseconds:线程超时时间1.5秒钟
         *
         * @param id
         * @return
         */
        @GetMapping("/payment/hystrix/timeout/{id}")
        @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
                @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
        })
        public String paymentInfo_TimeOut(Integer id) {
                //int age = 10/0;  //模拟程序运行异常，一进来就直接报错，并不牵扯到超时的问题，但是也可以进到服务降级处理fallback
                return paymentHystrixService.paymentInfo_TimeOut(id);
        }

        public String paymentInfo_TimeOutHandler(Integer id) {
                return "我是消费者80，对方支付系统繁忙，请10秒钟后再试，或者自己运行出错，请检查自己，o(╥﹏╥)o";
        }


        @GetMapping("/payment/hystrix/timeout2/{id}")
        @HystrixCommand
        public String paymentInfo_TimeOut2(Integer id) {
                int age = 10/0;  //模拟程序运行异常，一进来就直接报错，并不牵扯到超时的问题，但是也可以进到服务降级处理fallback
                return paymentHystrixService.paymentInfo_TimeOut(id);
        }

        /**
         * 全局fallback方法
         * 如果HystrixCommand没指明具体专属fallback处理方法的话，则使用默认的全局fallback方法
         * 如果HystrixCommand指明具体专属fallback处理方法的话，则使用自己专属的fallback方法
         */
        public String payment_Global_FallbackMethod(){
                return "Global异常处理信息,请稍后再试。";
        }
}
