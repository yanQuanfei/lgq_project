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


//    /**
//     * 抛出异常后通知 ： 在方法抛出异常退出时执行的通知。
//     *
//     * @param joinPoint
//     *            连接点：程序执行过程中的某一行为，例如，AServiceImpl.barA()的调用或者抛出的异常行为
//     */
//    public void doAfter(JoinPoint joinPoint) {
////      org.apache.ibatis.logging.LogFactory.useLog4JLogging();
//        String strLog = "doAfter:log Ending method: "
//                + joinPoint.getTarget().getClass().getName() + "."
//                + joinPoint.getSignature().getName();
//        logger.warn(strLog);
//    }
//
//
//    /**
//     * 捕获异常
//     * @param joinPoint
//     * @param e
//     */
//    public void doAfterThrowing(JoinPoint joinPoint, Exception e){
//        String strLog = "doAfterThrowing Begining method: " + joinPoint.getTarget().getClass().getName()
//                + "." + joinPoint.getSignature().getName();
//        logger.error("异常抛出exception " + strLog, e);
////       logger.error(Level.ERROR, "异常抛出exception", e);
//    }

//    //配置抛出异常后通知,使用在方法aspect()上注册的切入点
//    public void afterThrow(JoinPoint joinPoint, Exception ex){
//
//        System.out.println("进入切面AfterThrowing方法中...");
//
//        //判断日志输出级别
//        if(logger.isInfoEnabled()){
//            logger.info("afterThrow " + joinPoint + "\t" + ex.getMessage());
//        }
//        //详细错误信息
//        String errorMsg = "";
//        StackTraceElement[] trace = ex.getStackTrace();
//        for (StackTraceElement s : trace) {
//            errorMsg += "\tat " + s + "\r\n";
//        }
//        System.out.println("具体异常信息："+errorMsg);
//
//        System.out.println("afterThrow异常方法名 " + joinPoint + "\t" + ex.getMessage());
//
//        System.out.println("进入切面AfterThrowing方法结束！！！");
//
//    }






}
