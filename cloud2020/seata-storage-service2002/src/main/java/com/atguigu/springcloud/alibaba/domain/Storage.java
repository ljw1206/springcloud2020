package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-27 0:04
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {
        private Long id;

        //产品id
        private Long productId;

        //总库存
        private Integer total;

        //已用库存
        private Integer used;

        //剩余库存
        private Integer residue;
}
