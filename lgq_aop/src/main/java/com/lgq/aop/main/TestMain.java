package com.lgq.aop.main;

import com.lgq.aop.interfaces.HelloWorld;
import com.lgq.aop.interfaces.HelloWorld2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: lgq
 * @time: 2019/9/19 10:27
 * @description:
 */
public class TestMain {
    /**
     * @Param:[args]
     * @Return:void
     * @Description:测试AOP的main函数
     */
    public static void main(String[] args) {
//        ApplicationContext ctx=new ClassPathXmlApplicationContext("aop.xml");
//
//        HelloWorld hw1=(HelloWorld) ctx.getBean("helloWorldImplFirst");
//
//        hw1.printHelloWorld("xiaoming");

        ApplicationContext ctx=new ClassPathXmlApplicationContext("aop.xml");

        HelloWorld2 hw1=(HelloWorld2) ctx.getBean("helloWorldImplFirst");

        hw1.printHelloWorld("xiaoming");
    }
}
