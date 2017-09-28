package com.kaka.shiro.realm;

import com.kaka.users.dao.SysRoleMapper;
import com.kaka.users.dao.SysUserMapper;
import com.kaka.users.model.SysMenu;
import com.kaka.users.model.SysRole;
import com.kaka.users.model.SysUser;
import com.kaka.utils.Constance;
import com.kaka.utils.IPUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 数据库方式登陆
 * Created by QIEGAO on 2017/8/10.
 */
public class JdbcAuthorizingRealm extends AuthorizingRealm {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;


    //认证.登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        if (StringUtils.isNotEmpty(username)) {
            SysUser user = sysUserMapper.findByUserName(username);
            if (user == null)
                throw new UnknownAccountException("用户不存在");
            if (Constance.INT_NO == user.getState()) {
                throw new LockedAccountException("用户账号被禁用，请联系管理员！");
            }
            return new SimpleAuthenticationInfo(user, user.getPassword(), this.getClass().getName());
        }
        throw new AccountException("用户名不能为空");
    }


    //授权.菜单

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
//        SysUser user = (SysUser) principal.fromRealm(this.getName()).iterator().next();//获取session中的用户
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        this.saveUserLoginInfo(user, IPUtils.getIpAddr(request));
////        通过角色查找权限并将权限赋值给用户
//        List<String> permissions = new ArrayList<>();
//        Set<SysRole> roles = sysRoleMapper.findByUserId(user.getId());
//        if (roles != null && !roles.isEmpty()) {
//            for (SysRole role : roles) {
//                Set<SysMenu> menus = role.getSysMenuSet();
//                if (menus != null && !menus.isEmpty()) {
//                    menus.forEach(obj -> permissions.add(obj.getMenuName()));
//                }
//            }
//        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        info.addRoles(new HashSet(roles));
//        info.addStringPermissions(permissions);
        return info;
    }

    /**
     * 更新用户登陆信息
     *
     * @param user
     * @param ip
     */
    private void saveUserLoginInfo(SysUser user, String ip) {
//        taskExecutor.execute(() -> sysUserMapper.updateSysUserLoginAddress(user.getId(), IPUtils.getAddressByIp(ip)));
        user.setIp(ip);
        user.setLoginDate(new Timestamp(System.currentTimeMillis()));
//        sysUserMapper.updateSysUserIpById(user);
    }


}
