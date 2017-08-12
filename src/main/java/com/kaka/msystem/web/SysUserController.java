package com.kaka.msystem.web;

import com.kaka.common.utils.Result;
import com.kaka.msystem.model.SysUser;
import com.kaka.msystem.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Created by wuwanggao on 2017/8/11.
 */
@Controller
@RequestMapping(value = "/msystem/user/")
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    @RequestMapping(value = "userForm", method = RequestMethod.GET)
    public ModelAndView userForm(SysUser user) {
        return new ModelAndView("msystem/userForm");
    }


    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public ModelAndView addUser(SysUser user) {
        Result result = sysUserService.addUser(user);
        if (!result.isSucess()) {
            return new ModelAndView(new RedirectView("home"));
        }
        return new ModelAndView("index");
    }

    @RequestMapping(value = "addOrUpdateUser", method = RequestMethod.POST)
    public ModelAndView addOrUpdateUser(SysUser user) {
        Result result = sysUserService.addOrUpdateUser(user);
        if (!result.isSucess()) {
            return new ModelAndView(new RedirectView("home"));
        }
        return new ModelAndView("index");
    }


}
