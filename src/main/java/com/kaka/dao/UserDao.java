package com.kaka.dao;

import com.kaka.model.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * Created by QIEGAO on 2017/7/22.
 */

public interface UserDao {

    @Insert("insert into `User_Table` (id,username,password,nickname) values (#{id},#{username},#{password},#{nickname})")
    int insertUser(SysUser userEntity);

    /**
     * 根据用户名查找用户信息
     *
     * @param username
     * @return
     */
    @Select("select * from where `User_Table` where username = #{username}")
    SysUser findByUserName(String username);
}
