package com.dieyuyun.function;

/**
 * @Author hourglass1016
 * @create 2022/11/16 11:40
 */
@FunctionalInterface
public interface ThrowExceptionFunction {
    /**
     * 抛出异常信息
     *
     * @param message 异常信息
     * @return void
     **/
    void throwMessage(String message);
}
