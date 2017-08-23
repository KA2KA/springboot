package com.kaka.web;

import com.kaka.common.utils.Result;
import com.kaka.msystem.model.SysUser;
import com.kaka.msystem.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.security.auth.login.AccountException;

/**
 * Created by QIEGAO on 2017/8/24.
 */
@Controller
public class LoginController extends BaseController {

    @ApiOperation(value = "login", notes = "用户登陆")
    @RequestMapping(name = "/login", method = RequestMethod.POST)
    public ModelAndView login(ModelMap modelMap, SysUser user) {
        Result result = null;
        try {
            result = sysUserService.login(user);
        } catch (AccountException e) {
            e.printStackTrace();
            result.setResultFlag(false);
            result.setMessage("操作异常。");
        }
        modelMap.put("result", result);
        return new ModelAndView("index", modelMap);
    }


}
