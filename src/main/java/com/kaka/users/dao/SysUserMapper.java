package com.kaka.users.dao;

import com.kaka.users.model.SysUser;

public interface SysUserMapper {
    /**
     *
     * @mbggenerated 2017-09-27
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    int insert(SysUser record);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    int insertSelective(SysUser record);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    SysUser selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    int updateByPrimaryKey(SysUser record);

    SysUser findByUserName(String username);
}