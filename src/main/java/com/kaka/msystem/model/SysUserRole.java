package com.kaka.msystem.model;

import java.util.HashSet;
import java.util.Set;

/**
 * 系统角色用户关联表
 * Created by wuwan on 2016/9/30.
 */
@Deprecated
public class SysUserRole extends BaseEntity {
//    private Long userId;
//    private Long roleId;
    private Set<SysUser> sysUserSet =new HashSet<>();
    private Set<SysRole> sysRoleSet =new HashSet<>();

    public Set<SysUser> getSysUserSet() {
        return sysUserSet;
    }

    public void setSysUserSet(Set<SysUser> sysUserSet) {
        this.sysUserSet = sysUserSet;
    }

    public Set<SysRole> getSysRoleSet() {
        return sysRoleSet;
    }

    public void setSysRoleSet(Set<SysRole> sysRoleSet) {
        this.sysRoleSet = sysRoleSet;
    }
}
