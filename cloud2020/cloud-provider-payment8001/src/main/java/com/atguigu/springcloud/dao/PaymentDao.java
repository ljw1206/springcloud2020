package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 支付模块的数据访问层
 * @Author: Jeke Liang
 * @Date: 2021-08-07 16:54
 * @Version: v1.0
 */
@Mapper
public interface PaymentDao {

        public int create(Payment payment);

        public Payment getPaymentById(@Param("id") Long id);
}
