package com.kaka.msystem.service;

import com.kaka.common.utils.Result;
import com.kaka.msystem.model.SysUser;

/**
 * Created by QIEGAO on 2017/8/10.
 */

public interface SysUserService {

    /**
     * 仅添加用户
     */
    Result addUser(SysUser sysUser);

    /**
     * 添加或者更新用户
     *
     * @param sysUser
     * @return
     */
    Result addOrUpdateUser(SysUser sysUser);


    /**
     * 根据用户名查找用户信息+用户角色信息
     *
     * @param username
     */
    SysUser findUserAndRoleByUserName(String username);
}
