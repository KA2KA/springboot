package com.kaka.users.web;

import com.kaka.common.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户注册控制器 Restful
 *
 * @author wuwanggao@pinming.cn
 * @date 2017/9/30
 */
@Controller
@RequestMapping(value = "/join")
@Api(value = "注册接口", description = "注册接口")
public class RegisterController {


    @ApiOperation(value = "注册页面")
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView page() {
        return new ModelAndView("/join/sing_up");
    }

    @ApiOperation(value = "注册用户")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView createAccount(String username, String password) {


        return new ModelAndView("/join/sing_up");
    }


}
