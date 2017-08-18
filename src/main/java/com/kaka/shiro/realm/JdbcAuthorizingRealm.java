package com.kaka.shiro.realm;

import com.kaka.msystem.dao.SysUserMapper;
import com.kaka.msystem.dao.SysUserRoleMapper;
import com.kaka.msystem.model.SysMenu;
import com.kaka.msystem.model.SysRole;
import com.kaka.msystem.model.SysUser;
import com.kaka.msystem.model.SysUserRole;
import com.kaka.msystem.service.SysUserService;
import com.kaka.utils.IPUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.web.filter.mgt.DefaultFilter;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.task.TaskExecutor;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.apache.shiro.web.filter.mgt.DefaultFilter.user;

/**
 * 数据库方式登陆
 * Created by QIEGAO on 2017/8/10.
 */
public class JdbcAuthorizingRealm extends AuthorizingRealm {
    @Autowired
    private TaskExecutor taskExecutor;

    @Autowired
    private SysUserMapper sysUserMapper;


    //认证.登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        if (StringUtils.isNotEmpty(username)) {
            SysUser user = sysUserMapper.findUserRoleByUserName(username);
            if (!user.isDelFlag()) {
                throw new LockedAccountException("用户账号被禁用，请联系管理员！");
            }
            return new SimpleAuthenticationInfo(user, user.getPassword(), this.getClass().getName());
        }
        throw new AccountException("用户名不能为空");
    }


    //授权.菜单
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        SysUser user = (SysUser) principal.fromRealm(this.getName()).iterator().next();//获取session中的用户
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        user.setIp(IPUtils.getIpAddr(request));
        sysUserMapper.updateSysUserIpById(user);

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
