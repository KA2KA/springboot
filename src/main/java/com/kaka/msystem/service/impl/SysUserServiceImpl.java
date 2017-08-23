package com.kaka.msystem.service.impl;

import com.kaka.common.utils.Result;
import com.kaka.msystem.dao.SysRoleMapper;
import com.kaka.msystem.dao.SysUserMapper;
import com.kaka.msystem.model.SysRole;
import com.kaka.msystem.model.SysUser;
import com.kaka.msystem.service.SysUserService;
import com.kaka.utils.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.login.AccountException;
import java.util.Set;

/**
 * Created by wuwanggao on 2017/8/11.
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserDao;
    @Autowired
    private SysRoleMapper sysRoleMapper;


    @Override
    public Result addUser(SysUser sysUser) {
        sysUser.setId(IDGenerator.getId());
        return sysUserDao.insertSysUser(sysUser) <= 0 ? Result.fail() : Result.ok();
    }

    @Override
    public Result addOrUpdateUser(SysUser sysUser) {


        return null;
    }

    @Override
    public SysUser findUserAndRoleByUserName(String username) {
        SysUser sysUser = sysUserDao.findByUserName(username);
        Set<SysRole> sysRole = sysRoleMapper.findByUserId(sysUser.getId());
        sysUser.setSysRoleSet(sysRole);
        return sysUser;
    }

    @Override
    public Result login(SysUser user) throws AccountException {
        Result result = Result.ok();
        if (user == null) {
            throw new AccountException("获取用户名失败!");
        }
        user = sysUserDao.findByUserName(user.getUsername());
//        TODO
        result.setData(user);
        return result;
    }
}
