package com.lrs.controller;

import com.lrs.model.LrsUser;
import com.lrs.service.LrsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/27 21:11
 */
@Controller
@RequestMapping(value = "/user")
public class LrsUserController {
    @Autowired
    private LrsUserService lrsUserService;
    @GetMapping("/findAll")
    public String findAll(Model model){
        List<LrsUser> lrsUserList = lrsUserService.findAll();
        for (LrsUser lrsUser: lrsUserList
             ) {
            System.out.println("id:"+lrsUser.getId());
            System.out.println("name:" +lrsUser.getName());
        }
        return "hello";
    }
}
