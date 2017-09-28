package com.kaka.users.dao;

import com.kaka.users.model.SysMenu;

import java.util.List;

public interface SysMenuMapper {
    /**
     * @mbggenerated 2017-09-28
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbggenerated 2017-09-28
     */
    int insert(SysMenu record);

    /**
     * @mbggenerated 2017-09-28
     */
    int insertSelective(SysMenu record);

    /**
     * @mbggenerated 2017-09-28
     */
    SysMenu selectByPrimaryKey(Long id);

    /**
     * @mbggenerated 2017-09-28
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     * @mbggenerated 2017-09-28
     */
    int updateByPrimaryKey(SysMenu record);

    /**
     * 查询所有的菜单权限
     *
     * @return
     */
    List<SysMenu> selectAll();

    /**
     * 根据用户id查找菜单权限
     *
     * @param id
     * @return
     */
    List<SysMenu> selectByUserId(Long id);
}