package com.dieyuyun.function;

/**
 * 分支处理接口
 *
 * @Author hourglass1016
 * @create 2022/11/16 12:09
 */
public interface BranchHandle {
    /**
     * 分支操作
     *
     * @param trueHandle 为true时要进行的操作
     * @param falseHandle 为false时要进行的操作
     * @return void
     **/
    void trueOrFalseHandle(Runnable trueHandle, Runnable falseHandle);
}
