package com.kaka.system.dao;

import com.kaka.system.model.SysRole;
import com.kaka.utils.IdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by QIEGAO on 2017/8/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SysRoleDaoTest {
    @Autowired
    private SysRoleDao sysRoleDao;

    @Test
    public void insertSysRole() throws Exception {
        SysRole sysRole = new SysRole();
        sysRole.setId(new IdWorker().getWorkerId());
        sysRole.setRolename("superadmin");
        sysRole.setDescription("系统管理员");
        sysRole.setCreateBy("System");
        sysRole.setVersion(0);
        sysRoleDao.insertSysRole(sysRole);
    }

}