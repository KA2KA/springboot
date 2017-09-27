package com.kaka.users.service;

import com.kaka.users.model.SysUser;

/**
 * Created by wuwanggao on 2017/9/27.
 */
public interface SysUserService {
    /**
     * 根据id查找用户
     *
     * @param id
     * @return
     */
    SysUser selectByPrimaryKey(Long id);

}
