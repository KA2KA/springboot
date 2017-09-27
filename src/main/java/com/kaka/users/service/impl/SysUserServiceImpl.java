package com.kaka.users.service.impl;

import com.kaka.users.dao.SysUserMapper;
import com.kaka.users.model.SysUser;
import com.kaka.users.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wuwanggao@pinming.cn
 * @date 2017/9/27
 */
@Service
public class SysUserServiceImpl implements SysUserService {


    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        if (id == null) {
            return null;
        }
        return sysUserMapper.selectByPrimaryKey(id);
    }


}
