package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-26 16:44
 * @Version: v1.0
 */
@Mapper
public interface OrderDao {
        //新建订单
        void create(Order order);

        //修改订单状态, 从0改为1
        void update(@Param("userId") Long userId, @Param("status") Integer status);
}
