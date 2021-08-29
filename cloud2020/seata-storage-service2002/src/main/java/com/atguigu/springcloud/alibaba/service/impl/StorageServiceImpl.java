package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.StorageDao;
import com.atguigu.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-27 0:20
 * @Version: v1.0
 */
@Service
public class StorageServiceImpl implements StorageService {

        public static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

        @Resource
        private StorageDao storageDao;

        /**
         * 扣减库存
         * @param productId
         * @param count
         */
        @Override
        public void decrease(Long productId, Integer count) {
                LOGGER.info("---------->storage-service中扣减库存开始");
                storageDao.decrease(productId,count);
                LOGGER.info("---------->storage-service中扣减库存结束");

        }
}
