package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-13 1:12
 * @Version: v1.0
 */
public interface LoadBalancer {

        ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
