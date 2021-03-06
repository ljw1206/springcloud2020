package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.domain.CommonResult;
import com.atguigu.springcloud.alibaba.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-27 0:26
 * @Version: v1.0
 */
@RestController
public class StorageController {
        @Resource
        private StorageService storageService;

        @RequestMapping("/storage/decrease")
        public CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count){
                storageService.decrease(productId,count);
                return new CommonResult(200, "扣减库存成功！");
        }
}
