package com.lgq.aop.base;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @auther: lgq
 * @time: 2019/9/19 10:22
 * @description:
 */


public class LogHandle {

    Logger logger = LoggerFactory.getLogger(LogHandle.class);
    /**
     * @Param:[point]
     * @Return:void
     * @Description:演示的日志切面方法（环绕增强，且得到切点的参数和返回值）
     */
    public void printLog(ProceedingJoinPoint point) {
        Object[] args = point.getArgs();
        for (Object arg : args) {
            System.out.println("参数="+arg+" ");
        }
        try {
            Object object=point.proceed();
            System.out.println("返回值="+object);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕增强：日志log");
    }

}
