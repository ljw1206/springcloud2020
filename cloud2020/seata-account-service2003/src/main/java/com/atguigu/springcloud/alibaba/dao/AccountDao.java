package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: Jeke Liang
 * @Date: 2021-08-27 0:44
 * @Version: v1.0
 */
@Mapper
public interface AccountDao {

        /**
         * 扣减账户余额
         * @param userId
         * @param money
         */
        void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
