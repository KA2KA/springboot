package com.kaka;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hem on 2017/6/30.
 */
@RestController
public class HelloController {


    @ApiOperation(value = "跳转至主页", notes = "只支持get请求")
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

}
