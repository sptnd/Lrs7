package com.lrs.test;

import java.lang.reflect.Method;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/28 15:28
 */
public interface MyLogger {
    /*
    记录进入方法的时间
     */
    void saveIntoMethodTime(Method method);
    /*
    记录退出方法的时间
     */
    void saveOutMethodTime(Method method);
}
