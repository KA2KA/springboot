package com.kaka.users.dao;

import com.kaka.users.model.SysUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SysUserMapper {
    /**
     * 根据用户ID删除用户
     *
     * @param id
     * @return
     */
    @Delete("delete from sys_user where id = #{id,jdbcType=BIGINT}")
    int deleteByPrimaryKey(Long id);

    /**
     * @mbggenerated 2017-09-27
     */
    int insert(SysUser record);

    /**
     * @mbggenerated 2017-09-27
     */
    int insertSelective(SysUser record);

    /**
     * 根据id查找用户
     *
     * @param id
     * @return
     */
    @Select("select * from  sys_user where id =#{id}")
    SysUser selectByPrimaryKey(Long id);

    /**
     * @mbggenerated 2017-09-27
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * @mbggenerated 2017-09-27
     */
    int updateByPrimaryKey(SysUser record);


    SysUser findByUserName(String username);
}