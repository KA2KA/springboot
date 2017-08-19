package com.kaka.msystem.web;

import com.kaka.common.utils.Result;
import com.kaka.msystem.model.SysUser;
import com.kaka.msystem.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

/**
 * Created by wuwanggao on 2017/8/11.
 */
@Controller
@RequestMapping(value = "/user/")
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    @RequestMapping(value = "userForm", method = RequestMethod.GET)
    public ModelAndView userForm(SysUser user) {
        return new ModelAndView("msystem/userForm");
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ModelAndView login(SysUser user, HttpSession session) {
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(usernamePasswordToken);   //完成登录
            user = (SysUser) subject.getPrincipal();
            session.setAttribute("user", user);
        } catch (Exception e) {
            return new ModelAndView("index");
        }
        return new ModelAndView("home");
    }
}
