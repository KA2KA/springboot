package com.kaka.user.repository;

import com.kaka.user.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Hem on 2017/6/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {


    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
// 创建10条记录
        userRepository.save(new User("AAA", "10"));
        userRepository.save(new User("BBB", "20"));
        userRepository.save(new User("CCC", 30 + ""));
        userRepository.save(new User("DDD", 40 + ""));
        userRepository.save(new User("EEE", 50 + ""));
        userRepository.save(new User("FFF", 60 + ""));
        userRepository.save(new User("GGG", 70 + ""));
        userRepository.save(new User("HHH", 80 + ""));
        userRepository.save(new User("III", 90 + ""));
        userRepository.save(new User("JJJ", 100 + ""));
    }

    @Test
    public void findByNameAndPwd() throws Exception {
        User user = userRepository.findByNameAndPwd("AAA", "10");
        System.out.println(user.getName());
    }

}