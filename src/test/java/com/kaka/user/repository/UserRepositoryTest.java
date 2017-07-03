package com.kaka.user.repository;

import com.kaka.user.entity.Users;
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
        userRepository.save(new Users("AAA", "10"));
        userRepository.save(new Users("BBB", "20"));
        userRepository.save(new Users("CCC", 30 + ""));
        userRepository.save(new Users("DDD", 40 + ""));
        userRepository.save(new Users("EEE", 50 + ""));
        userRepository.save(new Users("FFF", 60 + ""));
        userRepository.save(new Users("GGG", 70 + ""));
        userRepository.save(new Users("HHH", 80 + ""));
        userRepository.save(new Users("III", 90 + ""));
        userRepository.save(new Users("JJJ", 100 + ""));
    }


    @Test
    public void findByName() throws Exception {

    }

    @Test
    public void findByNameAndAge() throws Exception {

    }

    @Test
    public void findUser() throws Exception {

    }

}