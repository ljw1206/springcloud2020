package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 订单接口
 * @Author: Jeke Liang
 * @Date: 2021-08-26 19:00
 * @Version: v1.0
 */
public interface OrderService {

        void create(Order order);
}
