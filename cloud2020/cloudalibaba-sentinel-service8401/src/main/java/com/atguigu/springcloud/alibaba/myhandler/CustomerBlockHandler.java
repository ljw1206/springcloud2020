package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.sun.deploy.security.BlockedException;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-25 2:05
 * @Version: v1.0
 */
public class CustomerBlockHandler {

        public static CommonResult handlerException(BlockException e){
                return new CommonResult(4444,"按客户自定义，global handlerException------1");
        }

        public static CommonResult handlerException2(BlockException e){
                return new CommonResult(4444,"按客户自定义，global handlerException------2");
        }
}
