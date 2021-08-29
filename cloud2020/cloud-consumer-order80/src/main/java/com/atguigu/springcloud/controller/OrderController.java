package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-07 23:50
 * @Version: v1.0
 */
@RestController
@Slf4j
public class OrderController {

        //public static final String PAYYMENT_URL = "http://localhost:8001"; //不集群
        public static final String PAYYMENT_URL = "http://CLOUD-PAYMENT-SERVICE"; //集群

        @Resource
        private RestTemplate restTemplate;

        @Resource
        private LoadBalancer loadBalancer;

        @Resource
        private DiscoveryClient discoveryClient;

        // object（postForObject/getForObject）的练习，返回对象是json，个人推荐使用object，毕竟json字符串大道其行
        @GetMapping("/consumer/payment/create")
        public CommonResult<Payment> create(Payment payment){
                return restTemplate.postForObject(PAYYMENT_URL + "/payment/create",payment,CommonResult.class);
        }

        @GetMapping("/consumer/payment/get/{id}")
        public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
                return restTemplate.getForObject(PAYYMENT_URL + "/payment/get/" + id,CommonResult.class);
        }

        // Entity（postForEntity/getForEntity）的练习，返回对象是ResponseEntity，包含有响应头、响应状态吗和响应体等重要信息，比较详细
        @GetMapping("/consumer/payment/createEntity")
        public CommonResult<Payment> create2(Payment payment){
                ResponseEntity<CommonResult> entity = restTemplate.postForEntity(PAYYMENT_URL + "/payment/create",payment,CommonResult.class);
                if (entity.getStatusCode().is2xxSuccessful()){
                        return entity.getBody();
                }else {
                        return new CommonResult<>(404, "操作失败");
                }

        }

        @GetMapping("/consumer/payment/getEntity/{id}")
        public CommonResult<Payment> getPayment2(@PathVariable("id") Long id){
                ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYYMENT_URL + "/payment/get/" + id,CommonResult.class);
                if (entity.getStatusCode().is2xxSuccessful()){
                        log.info(entity.getHeaders() + "\t" + entity.getStatusCode());
                        return entity.getBody();
                }else {
                        return new CommonResult<>(404, "操作失败");
                }

        }

        @GetMapping(value = "/consumer/payment/discovery")
        public Object discovery(){
                List<String> services = discoveryClient.getServices();
                for (String element : services) {
                        log.info("*****element：  " + element);
                }

                List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
                for (ServiceInstance instance : instances) {
                        log.info(instance.getServiceId()+" \t"+instance.getHost()+"\t"+instance.getPort()+"\t"+
                                instance.getUri());
                }

                return this.discoveryClient;
        }

        @GetMapping(value="/consumer/payment/lb")
        public String getPayymentLB(){
                //获取（指定微服务的）所有的服务实例
                List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
                if (instances == null || instances.size() <= 0){
                        return null;
                }
                ServiceInstance serviceInstance = loadBalancer.instances(instances);
                URI uri = serviceInstance.getUri();
                return restTemplate.getForObject(uri + "/payment/lb" , String.class);
        }

        @GetMapping("/consumer/payment/zipkin")
        public String paymentZipkin() {
                return restTemplate.getForObject("http://localhost:8001" + "/payment/zipkin", String.class);
        }

}
