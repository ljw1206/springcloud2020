package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.OrderDao;
import com.atguigu.springcloud.alibaba.domain.Order;
import com.atguigu.springcloud.alibaba.service.AccountService;
import com.atguigu.springcloud.alibaba.service.OrderService;
import com.atguigu.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-26 19:00
 * @Version: v1.0
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

        @Resource
        private OrderDao orderDao;

        @Resource
        private StorageService storageService;

        @Resource
        private AccountService accountService;

        /**
         * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
         * 简单说：
         * 下订单->减库存->减余额->改状态
         */
        @Override
        @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
        public void create(Order order) {

                log.info("---------开始新建订单");
                //创建新订单
                orderDao.create(order);

                log.info("---------订单微服务开始调用库存，做扣减Count");
                //扣减库存
                storageService.decrease(order.getProductId(), order.getCount());
                log.info("---------订单微服务开始调用库存，做扣减end");

                log.info("---------订单微服务开始调用账户，做扣减Money");
                //扣减账户余额
                accountService.decrease(order.getUserId(), order.getMoney());
                log.info("---------订单微服务开始调用账户，做扣减end");

                log.info("---------修改订单状态开始");
                //修改订单状态， 从0到1， 1代表已完成
                orderDao.update(order.getUserId(), 0);
                log.info("---------修改订单状态结束");

                log.info("---------下订单结束了，(*^▽^*)哈哈~");
        }

}
