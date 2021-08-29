package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.service.FlowLimitService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-24 16:18
 * @Version: v1.0
 */
@Service
public class FlowLimitServiceImpl implements FlowLimitService {
        @Override
        public String flowLimit() {
                return "sentinel流控，学习链路模式";
        }
}
