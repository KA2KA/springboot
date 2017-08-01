package com.kaka.model;

/**
 * 系统角色用户关联表
 * Created by wuwan on 2016/9/30.
 */
public class SysUserRole extends BaseEntity {
    private Long userId;
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
