package com.kaka.model;

/**
 * 系统角色表
 * Created by wuwan on 2016/9/30.
 */
public class SysRole extends BaseEntity {
    private String rolename;
    private String description;
    private Integer state;//
    private Long parentId; //角色父id


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
}
