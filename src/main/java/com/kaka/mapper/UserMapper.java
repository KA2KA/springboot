package com.kaka.mapper;


import com.kaka.model.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import javax.persistence.Table;

/**
 * 用户表管理
 * Created by QIEGAO on 2017/7/22.
 */

public interface UserMapper {

    @Insert("insert into `User_Table` (id,username,password,nickname) values (#{id},#{username},#{password},#{nickname})")
    int insertUser(SysUser userEntity);

    @Select("select * from `User_Table` where id = #{userId} ")
    SysUser findUserById(Long userId);


}
