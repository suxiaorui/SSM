package com.rui.controller;

import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/27 10:09
 * @Version 1.0
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String portal(){
        // 将逻辑视图返回
        return "index";
    }


    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }

}


