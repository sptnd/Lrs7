package com.lrs.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/27 13:48
 */
@Service
public class SpringTest {
    @Test
    public void testSpring(){
        //获取应用上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取SpringTest类
        SpringTest springTest = (SpringTest) applicationContext.getBean("springTest");
        //调用sayHello方法
        springTest.sayHello();
    }
    public void sayHello(){
        System.out.println("Hello! Spring");
    }
}
