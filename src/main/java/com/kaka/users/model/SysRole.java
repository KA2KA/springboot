package com.kaka.users.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wuwanggao@163.com
 */
public class SysRole extends BaseEntity implements Serializable {
    /**
     * 角色ID
     */
    private Long id;

    /**
     * 角色名
     */
    private String rolename;

    /**
     * 描述
     */
    private String description;

    /**
     * 角色父id
     */
    private Integer parentId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态
     */
    private Byte state;

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
     * 角色ID
     * @return id 角色ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 角色ID
     * @param id 角色ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 角色名
     * @return rolename 角色名
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * 角色名
     * @param rolename 角色名
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * 描述
     * @return description 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 角色父id
     * @return parent_id 角色父id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 角色父id
     *
     * @param parentId 角色父id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 备注
     *
     * @return remark 备注
     */
    @Override
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     *
     * @param remark 备注
     */
    @Override
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 状态
     *
     * @return state 状态
     */
    public Byte getState() {
        return state;
    }

    /**
     * 状态
     *
     * @param state 状态
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 创建数据用户
     *
     * @return create_by 创建数据用户
     */
    @Override
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建数据用户
     *
     * @param createBy 创建数据用户
     */
    @Override
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 更新数据用户
     *
     * @return update_by 更新数据用户
     */
    @Override
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新数据用户
     *
     * @param updateBy 更新数据用户
     */
    @Override
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 创建数据时间
     *
     * @return create_date 创建数据时间
     */
    @Override
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建数据时间
     *
     * @param createDate 创建数据时间
     */
    @Override
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新数据时间
     *
     * @return update_date 更新数据时间
     */
    @Override
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新数据时间
     *
     * @param updateDate 更新数据时间
     */
    @Override
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 删除标记：0正常 1不正常
     *
     * @return del_flag 删除标记：0正常 1不正常
     */
    @Override
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 删除标记：0正常 1不正常
     *
     * @param delFlag 删除标记：0正常 1不正常
     */
    @Override
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 数据版本
     *
     * @return version 数据版本
     */
    @Override
    public Integer getVersion() {
        return version;
    }

    /**
     * 数据版本
     *
     * @param version 数据版本
     */
    @Override
    public void setVersion(Integer version) {
        this.version = version;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SysRole sysRole = (SysRole) o;

        if (id != null ? !id.equals(sysRole.id) : sysRole.id != null) {
            return false;
        }
        if (rolename != null ? !rolename.equals(sysRole.rolename) : sysRole.rolename != null) {
            return false;
        }
        if (description != null ? !description.equals(sysRole.description) : sysRole.description != null) {
            return false;
        }
        if (parentId != null ? !parentId.equals(sysRole.parentId) : sysRole.parentId != null) {
            return false;
        }
        if (remark != null ? !remark.equals(sysRole.remark) : sysRole.remark != null) {
            return false;
        }
        if (state != null ? !state.equals(sysRole.state) : sysRole.state != null) {
            return false;
        }
        if (createBy != null ? !createBy.equals(sysRole.createBy) : sysRole.createBy != null) {
            return false;
        }
        if (updateBy != null ? !updateBy.equals(sysRole.updateBy) : sysRole.updateBy != null) {
            return false;
        }
        if (createDate != null ? !createDate.equals(sysRole.createDate) : sysRole.createDate != null) {
            return false;
        }
        if (updateDate != null ? !updateDate.equals(sysRole.updateDate) : sysRole.updateDate != null) {
            return false;
        }
        if (delFlag != null ? !delFlag.equals(sysRole.delFlag) : sysRole.delFlag != null) {
            return false;
        }
        return version != null ? version.equals(sysRole.version) : sysRole.version == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (rolename != null ? rolename.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (delFlag != null ? delFlag.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}