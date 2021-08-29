package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.alibaba.service.FlowLimitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-24 14:33
 * @Version: v1.0
 */
@RestController
@Slf4j
public class FlowLimitController {

        @Resource
        private FlowLimitService flowLimitService;

        @GetMapping("/testA")
        public String testA(){
                try {
                        TimeUnit.MILLISECONDS.sleep(800);
                }catch (InterruptedException e){
                        e.printStackTrace();
                }

                return "--------testA";
        }

        @GetMapping("/testB")
        public String testB(){
                log.info(Thread.currentThread().getName() + "\t" + "....testB");
                return "--------testB";
        }

        @GetMapping("/testC")
        public String testC(){
                return flowLimitService.flowLimit() + "frpm testC";
        }

        @GetMapping("/testD")
        public String testD(){
                /*try {
                        TimeUnit.SECONDS.sleep(1);
                }catch (InterruptedException e){
                        e.printStackTrace();
                }
                log.info("testD 测试RT");*/

                int age = 10/0;
                log.info("testD 测试异常比例");
                return flowLimitService.flowLimit() + "frpm testD";
        }

        @GetMapping("/testE")
        public String testE(){
                /*try {
                        TimeUnit.SECONDS.sleep(1);
                }catch (InterruptedException e){
                        e.printStackTrace();
                }*/
                log.info("testE 测试异常数");
                int age = 10/0;
                return "-----testE 测试异常数";
        }

        @GetMapping(value="/testHotKey")
        @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
        public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                                @RequestParam(value = "p2", required = false) String p2){
                int age = 10/0;
                return "-----testHotKey";
        }

        public String deal_testHotKey(String p1, String p2, BlockException exception){
                return "-----deal_testHotKey,o(╥﹏╥)o"; //sentinel系统默认的提示：Blocked by Sentinel (flow limiting)
        }
}
