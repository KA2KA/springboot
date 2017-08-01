package com.kaka.model;

/**
 * 系统用户表
 * Created by wuwan on 2016/9/30.
 */

public class SysUser extends BaseEntity {
    private String username; //用户名称
    private String password; //密码
    private String nickname; //昵称
    private Long phone;  //手机
    private String alias; //头像
    private Integer state; //状态

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
}
