package com.kaka.user.repository;


import com.kaka.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Table;

/**
 * Created by Hem on 2017/6/30.
 */
public interface UserRepository extends JpaRepository<User, Long> {

        User findByUsernameAndPassword(String username,String password);


}
