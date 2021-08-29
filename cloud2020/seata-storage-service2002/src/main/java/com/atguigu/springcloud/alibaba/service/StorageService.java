package com.atguigu.springcloud.alibaba.service;

/**
 * @Description: 存储库存接口
 * @Author: Jeke Liang
 * @Date: 2021-08-26 19:02
 * @Version: v1.0
 */
public interface StorageService {

        //扣减库存
        void decrease(Long productId, Integer count);
}
