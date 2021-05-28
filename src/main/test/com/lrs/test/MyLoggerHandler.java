package com.lrs.test;

import com.lrs.test.impl.MyLoggerImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/28 15:33
 */
public class MyLoggerHandler implements InvocationHandler {
    //原始对象
    private Object objOriginal;

    private MyLogger myLogger = new MyLoggerImpl();

    public MyLoggerHandler(Object obj){
        super();
        this.objOriginal = obj;
    }
    public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
        Object result = null;
        myLogger.saveIntoMethodTime(method);
        result = method.invoke(this.objOriginal,args);
        myLogger.saveOutMethodTime(method);
        return result;
    }
}
