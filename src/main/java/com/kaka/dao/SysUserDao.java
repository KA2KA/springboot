package com.kaka.dao;

import com.kaka.model.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 系统用户表的Dao
 * Created by QIEGAO on 2017/7/22.
 */

public interface SysUserDao {

    /**
     * 插入系统用户信息
     *
     * @param sysUser
     * @return
     */
    @Insert("insert into `sys_user`(id,username,password,nickname,phone,alias,state,create_by,update_by,del_flag,version) values" +
            "(#{id},#{username},#{password},#{nickname},#{phone},#{alias},#{state},#{createBy},#{updateBy},#{delFlag},#{version})")
    int insertSysUser(SysUser sysUser);


    @Update("update `sys_user` set  username =#{username} where id =#{id}")
    int updateSysUser(SysUser sysUser);


    /**
     * 根据用户名查找用户信息
     *
     * @param username
     * @return
     */
    @Select("select * from  `sys_user` where username = #{username}")
    SysUser findByUserName(String username);
}
