package com.kaka.model;

/**
 * Created by wuwan on 2016/9/30.
 */
public class SysRole extends BaseEntity {
    private String roleName;
    private String description;
    private Integer state;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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


}
