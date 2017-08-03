package com.kaka.model;

import java.sql.Timestamp;

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
    private Long usertype; //用户类型
    private String email; //邮箱
    private String login_address; //最近登陆地址
    private Timestamp login_date;//最近登陆时间
    private String ip; //最近登陆ip

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

    public Long getUsertype() {
        return usertype;
    }

    public void setUsertype(Long usertype) {
        this.usertype = usertype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin_address() {
        return login_address;
    }

    public void setLogin_address(String login_address) {
        this.login_address = login_address;
    }

    public Timestamp getLogin_date() {
        return login_date;
    }

    public void setLogin_date(Timestamp login_date) {
        this.login_date = login_date;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
