package com.kaka.mapper;

import com.kaka.dao.UserDao;
import com.kaka.model.SysUser;
import com.kaka.utils.IdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by QIEGAO on 2017/7/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserMapperTest {


    @Autowired
    private UserDao userMapper;
    @Test
    public void insertUser() throws Exception {
        SysUser userEntity = new SysUser();
        userEntity.setId(new IdWorker().getWorkerId());
        userEntity.setUserName("kaka");
        userEntity.setPassWord("kaka");
        userEntity.setNickName("KAKA");
        int i = userMapper.insertUser(userEntity);

    }

    @Test
    public void findUserById() throws Exception {
        UserEntity user = userMapper.findUserById(7L);
        System.out.println(user.getNickname());

    }

}