package com.kaka.users.service;

import com.kaka.users.model.SysMenu;
import com.kaka.users.model.SysRole;
import com.kaka.users.model.SysUser;

import java.util.List;
import java.util.Set;

/**
 * 用户权限处理
 *
 * @author wuwanggao@pinming.cn
 * @date 2017/9/28
 */
public interface SysUserAuthService {


    /**
     * 根据用户获取角色信息
     *
     * @param user
     * @return
     */
    Set<SysRole> findRolesByUser(SysUser user);

    /**
     * 通过用户和角色获取菜单权限
     *
     * @param user
     * @return
     */
    List<String> findPermissionsByUser(SysUser user);
}
