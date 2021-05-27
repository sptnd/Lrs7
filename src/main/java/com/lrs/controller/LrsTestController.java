package com.lrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/27 14:33
 */
@Controller //使用这个标记就说明这个类是一个springMVC Controller对象
@RequestMapping("/test")//用来处理请求地址映射的注解，表示类中所有相应请求都是以该地址作为父路径
public class LrsTestController {
    @GetMapping("/Hello")//组合注解
    public String Hello(){
        return "hello";//此处对应相应页面的名称如hello.jsp 此处应该写hello.
    }
}
