package com.lrs.test;

import com.lrs.test.impl.BusinessClassServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/28 15:42
 */
public class MyLoggerTest {
    public static void main(String[] ars){
        BusinessClassService businessClassService = new BusinessClassServiceImpl();

        MyLoggerHandler myLoggerHandler = new MyLoggerHandler(businessClassService);

        BusinessClassService businessClass = (BusinessClassService)
                Proxy.newProxyInstance(businessClassService.getClass().getClassLoader()
                ,businessClassService.getClass().getInterfaces(),myLoggerHandler);
        businessClass.doSomeThing();
    }
}
