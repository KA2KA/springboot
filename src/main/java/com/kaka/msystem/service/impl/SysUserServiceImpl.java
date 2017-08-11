package com.kaka.msystem.service.impl;

import com.kaka.msystem.dao.SysRoleDaoMapper;
import com.kaka.msystem.dao.SysUserMapper;
import com.kaka.msystem.model.SysRole;
import com.kaka.msystem.model.SysUser;
import com.kaka.msystem.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by wuwanggao on 2017/8/11.
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserDao;
    @Autowired
    private SysRoleDaoMapper sysRoleDaoMapper;


    @Override
    public void addUser(SysUser sysUser) {
        sysUserDao.insertSysUser(sysUser);
    }

    @Override
    public SysUser findUserAndRoleByUserName(String username) {
        SysUser sysUser = sysUserDao.findByUserName(username);
        Set<SysRole> sysRole = sysRoleDaoMapper.findByUserId(sysUser.getId());
        sysUser.setSysRoleSet(sysRole);
        return sysUser;
    }
}
