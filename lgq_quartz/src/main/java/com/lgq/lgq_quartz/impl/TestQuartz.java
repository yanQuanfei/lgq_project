package com.lgq.lgq_quartz.impl;

import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @auther: lgq
 * @time: 2019/9/17 10:01
 * @description:
 */
@Slf4j
@Component
@DisallowConcurrentExecution
public class TestQuartz extends QuartzJobBean {


    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info(new Date() + "：这是一个测试任务，任务开始------------------------------------>>>");
        log.info("你有哇哈哈哈吗?");

        log.info(new Date() + "：这是一个测试任务，任务结束------------------------------------>>>");
    }
}
