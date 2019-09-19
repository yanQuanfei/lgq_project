package com.lgq.lgq_config.impl;

import com.lgq.lgq_config.util.RedisTemplateUtil;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @auther: lgq
 * @time: 2019/9/17 16:22
 * @description:
 */
public class TestRedis {
    @Autowired
    RedisTemplateUtil redis;

    public void testRedis(){
        redis.hset("TEST_KEY","key1","123",600);
        String hget = redis.hget("TEST_KEY", "key1");
        System.out.println(hget);
    }

}
