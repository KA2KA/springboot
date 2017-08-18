package com.kaka.msystem.dao;

import com.kaka.msystem.model.SysRole;
import com.kaka.utils.IDGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by QIEGAO on 2017/8/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SysRoleMapperTest {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Test
    public void findByUserId() throws Exception {
        Set<SysRole> byUserId = sysRoleMapper.findByUserId(663472537157787648L);
        byUserId.forEach(obj -> System.out.println(obj.getRolename()));

    }

}