package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: 支付实体类
 * @Author: Jeke Liang
 * @Date: 2021-08-07 16:25
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

        private Long id;
        private String serial;

}
