package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-26 16:40
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
        private Long id;
        private Long userId;
        private Long productId;
        private Integer count;
        private BigDecimal money;

        /**
         * 订单状态： 0：创建中，1：已完结
         */
        private Integer status;
}
