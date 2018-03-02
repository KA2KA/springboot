package com.kaka.users.service.impl;

import com.kaka.users.dao.SysMenuMapper;
import com.kaka.users.dao.SysRoleMapper;
import com.kaka.users.model.SysMenu;
import com.kaka.users.model.SysRole;
import com.kaka.users.model.SysUser;
import com.kaka.users.service.SysUserAuthService;
import com.kaka.utils.Constance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author wuwanggao@pinming.cn
 * @date 2017/9/28
 */
@Service
public class SysUserAuthServiceImpl implements SysUserAuthService {

    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public Set<SysRole> findRolesByUser(SysUser user) {
        if (user == null) {
            return null;
        }
        List<SysRole> sysRoleList = sysRoleMapper.findRolesByUserId(user.getId());
        return sysRoleList.stream().collect(Collectors.toSet());
    }

    @Override
    public List<String> findPermissionsByUser(SysUser user) {
        List<String> permissions = new ArrayList<>();
        if (Constance.USER_ROOT.equals(user.getUsername())) {
            List<SysMenu> menus = sysMenuMapper.selectAll();
            menus.forEach(obj -> permissions.add(obj.getPerm()));
        } else {
            List<SysMenu> menus = sysMenuMapper.selectByUserId(user.getId());
            menus.forEach(obj -> permissions.add(obj.getPerm()));
        }
        return permissions;
    }
}
