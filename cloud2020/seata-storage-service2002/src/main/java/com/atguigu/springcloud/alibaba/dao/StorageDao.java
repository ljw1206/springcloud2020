package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-27 0:09
 * @Version: v1.0
 */
@Mapper
public interface StorageDao {

        //扣减库存
        void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
