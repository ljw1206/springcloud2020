package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-26 16:36
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

        private Integer code;
        private String message;
        private T      data;

        public CommonResult(Integer code, String message) {
                this(code,message,null);
        }
}
