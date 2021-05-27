package com.lrs.service;

import com.lrs.model.LrsUser;

import java.util.List;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/27 21:03
 * 创建对应的服务层接口
 */
public interface LrsUserService {
    List<LrsUser> findAll();
}
