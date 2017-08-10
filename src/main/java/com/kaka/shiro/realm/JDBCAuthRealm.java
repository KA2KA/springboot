package com.kaka.shiro.realm;

import com.kaka.msystem.model.SysMenu;
import com.kaka.msystem.model.SysRole;
import com.kaka.msystem.model.SysUser;
import com.kaka.msystem.service.SysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * JDBC数据库链接校验
 * Created by QIEGAO on 2017/8/10.
 */
public class JDBCAuthRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService sysUserService;

    //认证.登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        SysUser user = sysUserService.findUserAndRoleByUserName(username);
        return new SimpleAuthenticationInfo(user, user.getPassword(), this.getClass().getName());
    }

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        SysUser user = (SysUser) principal.fromRealm(this.getClass().getName()).iterator().next();//获取session中的用户
        List<String> permissions = new ArrayList<>();
        Set<SysRole> roles = user.getSysRoleSet();
        if (roles != null && !roles.isEmpty()) {
            for (SysRole role : roles) {
                Set<SysMenu> menus = role.getSysMenuSet();
                if (menus != null && !menus.isEmpty()) {
                    menus.forEach(obj -> permissions.add(obj.getMenuName()));
                }
            }
        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        info.addStringPermissions(permissions);
        return info;
    }


}
