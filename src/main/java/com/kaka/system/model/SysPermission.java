package com.kaka.system.model;

/**
 * 系统权限表
 * Created by wuwan on 2016/9/30.
 */
public class SysPermission extends BaseEntity {
    private Long menuId;//菜单配置id
    private Long roleId;//角色配置id

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}

