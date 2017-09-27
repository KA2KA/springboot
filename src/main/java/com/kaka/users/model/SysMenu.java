package com.kaka.users.model;

import java.util.Date;

public class SysMenu extends BaseEntity {
    /**
     * 菜单ID
     */
    private Long id;

    /**
     * 菜单名称
     */
    private String menuname;

    /**
     * 菜单url
     */
    private String url;

    /**
     * 菜单url
     */
    private String action;

    /**
     * 菜单图标
     */
    private String iconcls;

    /**
     * 级别
     */
    private Boolean grade;

    /**
     * 菜单状态
     */
    private Boolean state;

    /**
     * 叶子节点
     */
    private Boolean isleaf;

    /**
     * 父菜单ID
     */
    private Integer parentid;

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
     * 菜单ID
     * @return id 菜单ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 菜单ID
     * @param id 菜单ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 菜单名称
     * @return menuName 菜单名称
     */
    public String getMenuname() {
        return menuname;
    }

    /**
     * 菜单名称
     * @param menuname 菜单名称
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    /**
     * 菜单url
     * @return url 菜单url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 菜单url
     * @param url 菜单url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 菜单url
     * @return action 菜单url
     */
    public String getAction() {
        return action;
    }

    /**
     * 菜单url
     * @param action 菜单url
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * 菜单图标
     * @return iconcls 菜单图标
     */
    public String getIconcls() {
        return iconcls;
    }

    /**
     * 菜单图标
     * @param iconcls 菜单图标
     */
    public void setIconcls(String iconcls) {
        this.iconcls = iconcls == null ? null : iconcls.trim();
    }

    /**
     * 级别
     * @return grade 级别
     */
    public Boolean getGrade() {
        return grade;
    }

    /**
     * 级别
     * @param grade 级别
     */
    public void setGrade(Boolean grade) {
        this.grade = grade;
    }

    /**
     * 菜单状态
     * @return state 菜单状态
     */
    public Boolean getState() {
        return state;
    }

    /**
     * 菜单状态
     * @param state 菜单状态
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * 叶子节点
     * @return isleaf 叶子节点
     */
    public Boolean getIsleaf() {
        return isleaf;
    }

    /**
     * 叶子节点
     * @param isleaf 叶子节点
     */
    public void setIsleaf(Boolean isleaf) {
        this.isleaf = isleaf;
    }

    /**
     * 父菜单ID
     * @return parentid 父菜单ID
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 父菜单ID
     * @param parentid 父菜单ID
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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