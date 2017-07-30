package com.kaka.model;

import java.sql.Timestamp;

/**
 * 所有实体类的父类
 * Created by QIEGAO on 2017/7/22.
 */
public class BaseEntity {

    protected Long id;//表id
    protected String createBy; //创建数据操作用户
    protected Timestamp createDate;//创建数据时间
    protected String updateBy;//更新数据操作用户
    protected Timestamp updateDate;//更新数据时间
    protected boolean delFlag;//是否删除：0正常 1已删除
    protected Integer vision;//版本号:用来控制乐观锁

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public boolean isDelFlag() {
        return delFlag;
    }

    public void setDelFlag(boolean delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getVision() {
        return vision;
    }

    public void setVision(Integer vision) {
        this.vision = vision;
    }
}
