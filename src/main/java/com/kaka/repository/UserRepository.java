package com.kaka.repository;


import com.kaka.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hem on 2017/6/30.
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {

        UserEntity findByUsernameAndPassword(String username,String password);


}
