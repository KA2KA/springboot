package com.kaka.msystem.dao;

import com.kaka.msystem.model.SysRole;
import com.kaka.msystem.model.SysUser;
import com.kaka.utils.IDGenerator;
import com.kaka.utils.IdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Id;
import java.util.Set;

/**
 * Created by QIEGAO on 2017/8/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SysUserMapperTest {
    @Autowired
    private SysUserMapper userDao;
    @Test
    public void findUserRoleByUserName() throws Exception {
        SysUser user = userDao.findUserRoleByUserName("chengli");
        Set<SysRole> sysRoleSet = user.getSysRoleSet();
        System.out.println(sysRoleSet);

    }

    @Test
    public void updateUser() throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setId(new IdWorker().getId());
        sysUser.setUsername("kaka1");
        int i = userDao.updateSysUser(sysUser);
    }



    @Test
    public void insertUser() throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setId(IDGenerator.getId());
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