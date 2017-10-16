package com.kaka.users.dao;

import com.kaka.users.model.SysMenu;

import java.util.List;

/**
 * @author wuwanggao@163.com
 */
public interface SysMenuMapper {
    /**
     * 根据主键删除数据
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入数据
     *
     * @param record
     * @return
     */
    int insert(SysMenu record);

    /**
     * 根据不为空的字段，插入数据
     *
     * @param record
     * @return
     */
    int insertSelective(SysMenu record);

    /**
     * 根据主键查找实体
     *
     * @param id
     * @return
     */
    SysMenu selectByPrimaryKey(Long id);

    /**
     * 根据不为空的字段更新数据
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     * 根据主键更新数据
     *
     * @param record
     * @return
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