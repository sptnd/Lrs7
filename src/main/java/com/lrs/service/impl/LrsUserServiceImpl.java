package com.lrs.service.impl;

import com.lrs.dao.LrsUserDao;
import com.lrs.model.LrsUser;
import com.lrs.service.LrsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/27 21:06
 * 开发对应的服务层实现类。实现类主要是注入接口
 */
@Service
public class LrsUserServiceImpl implements LrsUserService {
    @Autowired
    private LrsUserDao lrsUserDao;

    @Override
    public List<LrsUser> findAll() {
        return lrsUserDao.findAll();
    }
}
