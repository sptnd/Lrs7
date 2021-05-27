package com.lrs.test;

import com.lrs.dao.LrsUserDao;
import com.lrs.model.LrsUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/27 22:31
 */
public class LrsUserDaoTest extends BaseJunit4Test {
    @Autowired
    private LrsUserDao lrsUserDao;

    @Test
    public void testFindAll(){
        List<LrsUser> userList = lrsUserDao.findAll();
        System.out.println(userList.size());
    }
}
