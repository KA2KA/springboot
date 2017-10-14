package com.kaka.users.web;

import com.kaka.common.utils.Result;
import org.apache.shiro.util.Assert;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 登陆控制器，采用Restful风格
 *
 * @author wuwanggao@pinming.cn
 * @date 2017/9/28
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    /**
     * 登陆页面
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public ModelAndView view() {
        return new ModelAndView(new RedirectView("login"));
    }


    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public Result login(@RequestParam String username, @RequestParam String password) {
        Assert.notNull(username, "username can not be empty");
        Assert.notNull(password, "password can not be empty");

        return Result.ok();
    }

    /**
     * 退出
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE, produces = {"application/json;charset=UTF-8"})
    public ModelAndView loginOut() {

        return new ModelAndView(new RedirectView(""));
    }

}
