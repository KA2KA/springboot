package com.kaka.common;

import com.kaka.dao.SysPermissionDao;
import com.kaka.dao.SysUserDao;
import com.kaka.model.SysMenu;
import com.kaka.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by QIEGAO on 2017/7/30.
 */
@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    SysUserDao userDao;
    @Autowired
    SysPermissionDao permissionDao;

    public UserDetails loadUserByUsername(String username) {
        SysUser user = userDao.findByUserName(username);
        if (user != null) {
            List<SysMenu> permissions = permissionDao.findAll();
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            for (SysMenu sysMenu : permissions) {
                if (sysMenu != null && sysMenu.getMenuName() != null) {

                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(sysMenu.getMenuName());
                    //1：此处将权限信息添加到 GrantedAuthority 对象中，在后面进行全权限验证时会使用GrantedAuthority 对象。
                    grantedAuthorities.add(grantedAuthority);
                }
            }
            return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
        } else {
            throw new UsernameNotFoundException("admin: " + username + " do not exist!");
        }
    }


}
