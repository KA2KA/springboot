package com.kaka.model;

/**
 * Created by wuwan on 2016/9/30.
 */
public class SysUser extends BaseEntity {
    private String userName; //用户名称
    private String passWord; //密码
    private String nickName; //昵称
    private String alias; //头像
    private Integer state; //状态

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

}
