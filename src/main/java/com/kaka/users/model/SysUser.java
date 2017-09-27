package com.kaka.users.model;


import java.util.Date;

public class SysUser extends BaseEntity {
    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户类型
     */
    private Byte usertype;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 手机号
     */
    private Integer phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户头像
     */
    private String alias;

    /**
     * 最近登陆地址
     */
    private String loginAddress;

    /**
     * 最近登陆时间
     */
    private Date loginDate;

    /**
     * 登陆IP
     */
    private String ip;

    /**
     * 用户状态
     */
    private Integer state;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建数据用户
     */
    private String createBy;

    /**
     * 更新数据用户
     */
    private String updateBy;

    /**
     * 创建数据时间
     */
    private Date createDate;

    /**
     * 更新数据时间
     */
    private Date updateDate;

    /**
     * 删除标记：0正常 1不正常
     */
    private Integer delFlag;

    /**
     * 数据版本
     */
    private Integer version;

    /**
     * 用户ID
     * @return id 用户ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 用户ID
     * @param id 用户ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户名
     * @return username 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 用户类型
     * @return usertype 用户类型
     */
    public Byte getUsertype() {
        return usertype;
    }

    /**
     * 用户类型
     * @param usertype 用户类型
     */
    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    /**
     * 用户密码
     * @return password 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 用户密码
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 昵称
     * @return nickname 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 昵称
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 性别
     * @return sex 性别
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex 性别
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * 手机号
     * @return phone 手机号
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * 手机号
     * @param phone 手机号
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * 邮箱
     * @return email 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 用户头像
     * @return alias 用户头像
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 用户头像
     * @param alias 用户头像
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    /**
     * 最近登陆地址
     * @return login_address 最近登陆地址
     */
    public String getLoginAddress() {
        return loginAddress;
    }

    /**
     * 最近登陆地址
     * @param loginAddress 最近登陆地址
     */
    public void setLoginAddress(String loginAddress) {
        this.loginAddress = loginAddress == null ? null : loginAddress.trim();
    }

    /**
     * 最近登陆时间
     * @return login_date 最近登陆时间
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * 最近登陆时间
     * @param loginDate 最近登陆时间
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * 登陆IP
     * @return ip 登陆IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 登陆IP
     * @param ip 登陆IP
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 用户状态 0正常  1禁用
     * @return state 用户状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 用户状态  0正常  1禁用
     * @param state 用户状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 创建数据用户
     * @return create_by 创建数据用户
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建数据用户
     * @param createBy 创建数据用户
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 更新数据用户
     * @return update_by 更新数据用户
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新数据用户
     * @param updateBy 更新数据用户
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 创建数据时间
     * @return create_date 创建数据时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建数据时间
     * @param createDate 创建数据时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新数据时间
     * @return update_date 更新数据时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新数据时间
     * @param updateDate 更新数据时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 删除标记：0正常 1不正常
     * @return del_flag 删除标记：0正常 1不正常
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 删除标记：0正常 1不正常
     * @param delFlag 删除标记：0正常 1不正常
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 数据版本
     * @return version 数据版本
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 数据版本
     * @param version 数据版本
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}