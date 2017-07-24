package com.kaka.mapper;

import com.kaka.model.UserEntity;
import com.kaka.utils.IdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by QIEGAO on 2017/7/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserMapperTest {


    @Autowired
    private UserMapper userMapper;
    @Test
    public void insertUser() throws Exception {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(new IdWorker().getWorkerId());
        userEntity.setUsername("kaka");
        userEntity.setPassword("kaka");
        userEntity.setNickname("KAKA");
        int i = userMapper.insertUser(userEntity);

    }

    @Test
    public void findUserById() throws Exception {
        UserEntity user = userMapper.findUserById(7L);
        System.out.println(user.getNickname());

    }

}