package com.kaka.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Hem on 2017/6/30.
 */
@Controller
public class WebController {

    @RequestMapping("/index")
    public ModelAndView index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return new ModelAndView("index");
    }


}
