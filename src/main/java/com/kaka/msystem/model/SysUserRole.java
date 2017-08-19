package com.kaka.msystem.model;

import java.util.HashSet;
import java.util.Set;

/**
 * 系统角色用户关联表
 * Created by wuwan on 2016/9/30.
 *
 */
@Deprecated
public class SysUserRole extends BaseEntity {
    //    private Long userId;
//    private Long roleId;
    private SysUser sysUser;
    private SysRole sysRole;

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public SysRole getSysRole() {
        return sysRole;
    }

    public void setSysRole(SysRole sysRole) {
        this.sysRole = sysRole;
    }
}

