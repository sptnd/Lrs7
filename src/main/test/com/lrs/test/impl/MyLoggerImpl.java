package com.lrs.test.impl;

import com.lrs.test.MyLogger;

import java.lang.reflect.Method;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/28 15:29
 */
public class MyLoggerImpl implements MyLogger {
    @Override
    public void saveIntoMethodTime(Method method) {
        System.out.println("进入"+method.getName()+"方法的时间为："+System.currentTimeMillis());
    }

    @Override
    public void saveOutMethodTime(Method method) {
        System.out.println("退出"+method.getName()+"方法的时间为："+System.currentTimeMillis());
    }
}
