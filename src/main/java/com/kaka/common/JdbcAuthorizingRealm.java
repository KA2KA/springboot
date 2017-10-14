package com.kaka.common;

import com.kaka.users.dao.SysUserMapper;
import com.kaka.users.model.SysRole;
import com.kaka.users.model.SysUser;
import com.kaka.users.service.SysUserAuthService;
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
    private SysUserAuthService sysUserAuthService;

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
        SysUser user = (SysUser) principal.getPrimaryPrincipal();
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String ip = IPUtils.getIpAddr(request);
        user = this.saveUserLoginInfo(user, ip);

        Set<SysRole> roleSet = sysUserAuthService.findRolesByUser(user);
        List<String> permissions = sysUserAuthService.findPermissionsByUser(user);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(new HashSet(roleSet));
        info.addStringPermissions(permissions);
        return info;
    }

    /**
     * 更新用户登陆信息
     *
     * @param user
     * @param ip
     */
    private SysUser saveUserLoginInfo(SysUser user, String ip) {
        user = sysUserMapper.findByUserName(user.getUsername());
        if (user == null) {
            return user;
        }
        user.setIp(ip);
        user.setLoginAddress(IPUtils.getAddressByIp(ip));
        user.setLoginDate(new Timestamp(System.currentTimeMillis()));
        sysUserMapper.updateByPrimaryKey(user);
        return user;
    }


}
