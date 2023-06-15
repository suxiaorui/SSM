package com.rui.controller;

import com.rui.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/27 16:46
 * @Version 1.0
 */

@Controller
public class TestParamController {

    @RequestMapping("/param/servletAPI")
    public String getParamByServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + ",password:" + password);
        return "success";
    }

    @RequestMapping("/param")
    public String getParam(String username, String password){
        System.out.println("username:" + username + ",password:" + password);
        return "success";
    }


    @RequestMapping("/param/pojo")
    public String getParamByPojo(User user){
        System.out.println(user);
        return "success";
    }
}
