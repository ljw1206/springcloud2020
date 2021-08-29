package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-13 1:17
 * @Version: v1.0
 */
@Component
public class MyLB implements LoadBalancer {

        private AtomicInteger atomicInteger = new AtomicInteger(0);

        //获取当前是第几次访问次数
        public final int getAndIncrement(){
                int current;//预期值，当前已经有过几次调用了
                int next;//下一次调用次数，或者说，这一次进来调用的话，是第几次调用

                do {
                        current = this.atomicInteger.get();
                        next = current >= 2147483647 ? 0 : current + 1;
                }while (!this.atomicInteger.compareAndSet(current,next));
                System.out.println("*****第几次访问，次数next: " + next);
                return next;
        }

        //求模取余，获取要被调用的服务实例
        //负载均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标 ， 每次服务重启动后rest接口计数从1开始。
        @Override
        public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
                int index = getAndIncrement() % serviceInstances.size();
                return serviceInstances.get(index);
        }
}
