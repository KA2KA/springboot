package com.kaka.users.dao;

import com.kaka.users.model.SysRole;

public interface SysRoleMapper {
    /**
     *
     * @mbggenerated 2017-09-27
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    int insert(SysRole record);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    int insertSelective(SysRole record);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    SysRole selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    int updateByPrimaryKey(SysRole record);
}