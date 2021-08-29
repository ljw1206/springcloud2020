package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.AccountDao;
import com.atguigu.springcloud.alibaba.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-27 0:57
 * @Version: v1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

        public static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

        @Resource
        private AccountDao accountDao;

        @Override
        public void decrease(Long userId, BigDecimal money) {
                LOGGER.info("----------->account-service中扣减账户余额开始");
                //模拟超时异常，全局事务回滚
                try {
                        TimeUnit.SECONDS.sleep(20);
                }catch (InterruptedException e){
                        e.printStackTrace();
                }
                accountDao.decrease(userId, money);
                LOGGER.info("----------->account-service中扣减账户余额结束");
        }
}
