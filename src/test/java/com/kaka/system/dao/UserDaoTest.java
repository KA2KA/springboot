package com.kaka.system.dao;

import com.kaka.system.model.SysUser;
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
        sysUser.setId(new IdWorker().getId());
        sysUser.setUsername("kaka1");
        int i = userDao.updateSysUser(sysUser);


    }

    @Autowired
    private SysUserDao userDao;

    @Test
    public void insertUser() throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setId(new IdWorker().getId());
        sysUser.setUsername("kaka");
        sysUser.setPassword("kaka");
        sysUser.setNickname("KAKA");
        sysUser.setCreateBy("张三");
        sysUser.setVersion(0);
        userDao.insertSysUser(sysUser);
    }

    @Test
    public void findByUserName() throws Exception {

        SysUser kaka = userDao.findByUserName("kaka");
        System.out.println("username:"+kaka);
    }

}