package com.kaka.system.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 系统角色表
 * Created by wuwan on 2016/9/30.
 */
public class SysRole extends BaseEntity {
    private String rolename;
    private String description;
    private Integer state;//
    private Long parentId; //角色父id
    private Set<SysUser> users =new HashSet<>();
    private Set<SysMenu> menus =new HashSet<>();



    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Set<SysUser> getUsers() {
        return users;
    }

    public void setUsers(Set<SysUser> users) {
        this.users = users;
    }

    public Set<SysMenu> getMenus() {
        return menus;
    }

    public void setMenus(Set<SysMenu> menus) {
        this.menus = menus;
    }
}
