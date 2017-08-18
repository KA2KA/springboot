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
    private SysMenu sysMenu;
    private SysRole sysRole;

    public SysMenu getSysMenu() {
        return sysMenu;
    }

    public void setSysMenu(SysMenu sysMenu) {
        this.sysMenu = sysMenu;
    }

    public SysRole getSysRole() {
        return sysRole;
    }

    public void setSysRole(SysRole sysRole) {
        this.sysRole = sysRole;
    }
}

