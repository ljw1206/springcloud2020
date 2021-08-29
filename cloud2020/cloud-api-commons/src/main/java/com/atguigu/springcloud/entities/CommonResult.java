package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: json封装体CommonResult
 * @Author: Jeke Liang
 * @Date: 2021-08-07 16:33
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
      private Integer code;
      private String message;
      private T      data;

      public CommonResult(Integer code, String message){
              this(code, message, null);
      }
}
