package com.kaka.users.dao;

import com.kaka.users.model.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wuwanggao on 2017/9/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SysUserMapperTest {
    @Autowired
    private  SysUserMapper sysUserMapper;
    @Test
    public void selectByPrimaryKey() throws Exception {
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(663157522757910528L);
        System.out.println(sysUser.getId());

    }

}