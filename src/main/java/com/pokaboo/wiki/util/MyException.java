package com.pokaboo.wiki.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pokaboo
 * 自定义异常
 * @AllArgsConstructor ： 生成有参构造方法
 * @NoArgsConstructor ： 生成无参构造方法
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyException extends RuntimeException {

    private Integer code;

    private String msg;

    @Override
    public String toString() {
        return "MyException{" +
                "message=" + this.getMessage() +
                ", code=" + code +
                '}';
    }
}
