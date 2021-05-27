package com.lrs.dao;

import com.lrs.model.LrsUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/27 21:01
 * 这是一个接口，提供了findAll方法用来查询所有的用户
 */
@Repository
public interface LrsUserDao {
    List<LrsUser> findAll();
}
