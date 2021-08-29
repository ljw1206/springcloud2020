package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: 存储库存接口
 * @Author: Jeke Liang
 * @Date: 2021-08-26 19:02
 * @Version: v1.0
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

        @PostMapping(value = "/storage/decrease")
        CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
