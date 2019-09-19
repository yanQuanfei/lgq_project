package com.lgq.aop.impl;

import com.lgq.aop.base.LogHandle;
import com.lgq.aop.interfaces.HelloWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @auther: lgq
 * @time: 2019/9/19 10:21
 * @description:
 */
public class HelloWorldFirstImpl implements HelloWorld {


    @Override
    public String printHelloWorld(String name) {
        System.out.println("我是演示方法printHelloWorld1");
        int a = 1 / 0;
        return "first";
    }
}
