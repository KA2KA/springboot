package com.kaka.users.model;

import java.util.Date;

/**
 * 所有实体类的父类
 * Created by QIEGAO on 2017/7/22.
 */
public class BaseEntity {


    /**
     * 备注
     */
    protected String remark;

    /**
     * 创建数据用户
     */
    protected String createBy;

    /**
     * 更新数据用户
     */
    protected String updateBy;

    /**
     * 创建数据时间
     */
    protected Date createDate;

    /**
     * 更新数据时间
     */
    protected Date updateDate;

    /**
     * 删除标记：0正常 1不正常
     */
    protected Integer delFlag;

    /**
     * 数据版本
     */
    protected Integer version;


    public BaseEntity() {
        this.delFlag = 0;
    }


    /**
     * 备注
     *
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 创建数据用户
     *
     * @return create_by 创建数据用户
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建数据用户
     *
     * @param createBy 创建数据用户
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 更新数据用户
     *
     * @return update_by 更新数据用户
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新数据用户
     *
     * @param updateBy 更新数据用户
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 创建数据时间
     *
     * @return create_date 创建数据时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建数据时间
     *
     * @param createDate 创建数据时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新数据时间
     *
     * @return update_date 更新数据时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新数据时间
     *
     * @param updateDate 更新数据时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 删除标记：0正常 1不正常
     *
     * @return del_flag 删除标记：0正常 1不正常
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 删除标记：0正常 1不正常
     *
     * @param delFlag 删除标记：0正常 1不正常
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 数据版本
     *
     * @return version 数据版本
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 数据版本
     *
     * @param version 数据版本
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

}
