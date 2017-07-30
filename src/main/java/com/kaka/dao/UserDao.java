package com.kaka.mapper;

import com.kaka.model.UserEntity;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by QIEGAO on 2017/7/22.
 */

public interface UserMapper {

    @Insert("insert into `User_Table` (id,username,password,nickname) values (#{id},#{username},#{password},#{nickname})")
    int insertUser(UserEntity userEntity);


}
