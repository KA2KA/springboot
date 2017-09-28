package com.kaka.users.web;

import org.apache.shiro.util.Assert;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 登陆控制器，采用Restful风格
 *
 * @author wuwanggao@pinming.cn
 * @date 2017/9/28
 */
@Controller
@RequestMapping(value = "/users/")
public class LoginController {

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */

    @RequestMapping(value = "", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public ModelAndView login(@RequestParam String username, @RequestParam String password) {
        Assert.notNull(username, "username can not be empty");
        Assert.notNull(password, "password can not be empty");

        return new ModelAndView(new RedirectView(""));
    }


}
