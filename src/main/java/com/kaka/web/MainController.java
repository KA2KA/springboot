package com.kaka.web;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 入口控制器
 * Created by Hem on 2017/6/30.
 */
@Controller
public class MainController {

    @ApiOperation(value = "index", notes = "访问系统主页")
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public ModelAndView index(ModelMap map) {
        return new ModelAndView("index");
    }


}
