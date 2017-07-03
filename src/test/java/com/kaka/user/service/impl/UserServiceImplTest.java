package com.kaka.user.service.impl;

import com.kaka.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Hem on 2017/6/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserService userSerivce;

    @Test
    public void create() throws Exception {
        userSerivce.create("test", 10);
    }

    @Test
    public void deleteByName() throws Exception {

        userSerivce.deleteByName("test");

    }

    @Test
    public void getAllUsers() throws Exception {
        Integer allUsers = userSerivce.getAllUsers();
    }

    @Test
    public void deleteAllUsers() throws Exception {
        userSerivce.deleteAllUsers();

    }

}