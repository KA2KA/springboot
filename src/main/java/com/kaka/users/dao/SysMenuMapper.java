package com.kaka.users.dao;

import com.kaka.users.model.SysMenu;

public interface SysMenuMapper {
    /**
     *
     * @mbggenerated 2017-09-27
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    int insert(SysMenu record);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    int insertSelective(SysMenu record);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    SysMenu selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     *
     * @mbggenerated 2017-09-27
     */
    int updateByPrimaryKey(SysMenu record);
}