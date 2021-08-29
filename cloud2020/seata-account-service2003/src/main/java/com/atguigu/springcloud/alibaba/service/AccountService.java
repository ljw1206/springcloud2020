package com.atguigu.springcloud.alibaba.service;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-27 0:56
 * @Version: v1.0
 */
public interface AccountService {
        /**
         * 扣减账户余额
         * @param userId
         * @param money
         */
        void decrease(Long userId, BigDecimal money);
}
