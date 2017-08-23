package com.kaka.web;

import com.kaka.msystem.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by QIEGAO on 2017/8/24.
 */
@Controller
public class BaseController {
    @Autowired
    protected SysUserService sysUserService;
}
