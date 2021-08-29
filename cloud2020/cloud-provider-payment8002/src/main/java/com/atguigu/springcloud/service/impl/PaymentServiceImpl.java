package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: 支付接口实现类
 * @Author: Jeke Liang
 * @Date: 2021-08-07 17:31
 * @Version: v1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

        @Resource
        private PaymentDao paymentDao;

        @Override
        public int create(Payment payment) {
                return paymentDao.create(payment);
        }

        @Override
        public Payment getPaymentById(Long id) {
                return paymentDao.getPaymentById(id);
        }
}
