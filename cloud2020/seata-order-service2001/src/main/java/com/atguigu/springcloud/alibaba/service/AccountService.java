package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Description: 用户账户接口
 * @Author: Jeke Liang
 * @Date: 2021-08-26 19:03
 * @Version: v1.0
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

        @PostMapping(value = "/account/decrease")
        CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
