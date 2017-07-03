package com.kaka.user.repository;


import com.kaka.user.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hem on 2017/6/30.
 */
public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByName(String name);

    Users findByNameAndAge(String name, Integer age);

//    @Query("from Users u where u.username=:username")
//    Users findUser(@Param("name") String name);

}
