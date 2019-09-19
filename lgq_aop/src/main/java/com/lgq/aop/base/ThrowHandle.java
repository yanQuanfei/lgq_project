package com.lgq.aop.base;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

/**
 * @auther: lgq
 * @time: 2019/9/19 12:57
 * @description:
 */
public class ThrowHandle implements ThrowsAdvice {

    Logger logger = LoggerFactory.getLogger(LogHandle.class);


    //配置抛出异常后通知,使用在方法aspect()上注册的切入点
    public void afterThrowing(JoinPoint joinPoint, Exception ex){

        System.out.println("进入切面AfterThrowing方法中...");

        //判断日志输出级别
        if(logger.isInfoEnabled()){
            logger.info("afterThrow " + joinPoint + "\t" + ex.getMessage());
        }
        //详细错误信息
        String errorMsg = "";
        StackTraceElement[] trace = ex.getStackTrace();
        for (StackTraceElement s : trace) {
            errorMsg += "\tat " + s + "\r\n";
        }
        System.out.println("具体异常信息："+errorMsg);

        System.out.println("afterThrow异常方法名 " + joinPoint + "\t" + ex.getMessage());

        System.out.println("进入切面AfterThrowing方法结束！！！");

    }

//        public void afterThrowing(JoinPoint joinPoint, Exception ex){
//        String strLog = "doAfterThrowing Begining method: " + joinPoint.getTarget().getClass().getName()
//                + "." + joinPoint.getSignature().getName();
//        logger.error("异常抛出exception " + strLog, ex);
////       logger.error(Level.ERROR, "异常抛出exception", e);
//    }
}
