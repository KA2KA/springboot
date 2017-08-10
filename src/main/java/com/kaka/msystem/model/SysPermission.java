package com.kaka.msystem.model;

import java.util.HashSet;
import java.util.Set;

/**
 * 系统权限表
 * Created by wuwan on 2016/9/30.
 */
@Deprecated
public class SysPermission extends BaseEntity {
    //    private Long menuId;//菜单配置id
    //    private Long roleId;//角色配置id
    private Set<SysMenu> sysMenuSet = new HashSet<>();
    private Set<SysRole> sysRoleSet = new HashSet<>();

    public Set<SysMenu> getSysMenuSet() {
        return sysMenuSet;
    }

    public void setSysMenuSet(Set<SysMenu> sysMenuSet) {
        this.sysMenuSet = sysMenuSet;
    }

    public Set<SysRole> getSysRoleSet() {
        return sysRoleSet;
    }

    public void setSysRoleSet(Set<SysRole> sysRoleSet) {
        this.sysRoleSet = sysRoleSet;
    }
}

