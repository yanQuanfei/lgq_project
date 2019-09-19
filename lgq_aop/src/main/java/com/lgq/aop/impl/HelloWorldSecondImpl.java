package com.lgq.aop.impl;

import com.lgq.aop.interfaces.HelloWorld;
import com.lgq.aop.interfaces.HelloWorld2;

/**
 * @auther: lgq
 * @time: 2019/9/19 13:05
 * @description:
 */
public class HelloWorldSecondImpl implements HelloWorld2 {

    @Override
    public String printHelloWorld(String name) {
        System.out.println("我是演示方法printHelloWorld2");
        int a = 1 / 0;
        return "first";
    }
}
