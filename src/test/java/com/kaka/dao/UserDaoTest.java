package com.kaka.dao;

import com.kaka.model.SysUser;
import com.kaka.utils.IdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by QIEGAO on 2017/8/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserDaoTest {
    @Test
    public void updateUser() throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setId(9L);
        sysUser.setUsername("kaka1");
        int i = userDao.updateUser(sysUser);


    }

    @Autowired
    private SysUserDao userDao;

    @Test
    public void insertUser() throws Exception {
        SysUser sysUser = new SysUser();
        long workerId = new IdWorker().getWorkerId();
        sysUser.setId(workerId);
        System.out.println("workerId"+workerId);
        sysUser.setUsername("kaka");
        sysUser.setPassword("kaka");
        sysUser.setNickname("KAKA");
        userDao.insertUser(sysUser);
    }

    @Test
    public void findByUserName() throws Exception {

        SysUser kaka = userDao.findByUserName("kaka");
        System.out.println("username:"+kaka);
    }

}