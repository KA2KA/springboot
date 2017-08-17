package com.kaka.msystem.dao;

import com.kaka.msystem.model.SysUserRole;

/**
 * 用户角色表
 * Created by QIEGAO on 2017/8/17.
 */
public interface SysUserRoleMapper {

    /**
     * 通过用户名查找用户角色信息
     *
     * @param username
     * @return
     */
    SysUserRole findSysUserRoleByUserName(String username);
}
