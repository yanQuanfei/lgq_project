package com.lgq.aop.base;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auther: lgq
 * @time: 2019/9/19 10:24
 * @description:
 */

public class TimeHandle {

    /**
     * @Param:[]
     * @Return:void
     * @Description:演示的时间切面方法（前后增强），记录方法开始时间和结束时间
     */
    public void printStartTime(){
        System.out.println("startTime="+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    public void printEntTime(){
        System.out.println("entTime="+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

}
