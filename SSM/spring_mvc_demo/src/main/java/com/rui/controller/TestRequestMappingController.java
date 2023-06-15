package com.rui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/27 15:46
 * @Version 1.0
 *
 * @RequestMapping标识一个类：设置映射请求的请求路径的初始信息
 * @RequestMapping标识一个方法：设置映射请求请求路径的具体信息
 *
 * @RequestMapping注解的method属性通过请求的请求方式（get或post）匹配请求映射
 * @RequestMapping注解的method属性是一个RequestMethod类型的数组，表示该请求映射能够匹配多种请求方式的请求
 */
@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {

    @RequestMapping(value = {"/hello","/abc"},
            method = {RequestMethod.GET,RequestMethod.POST},
            params = {"username"})
    public String hello(){
        return "success";
    }

    @RequestMapping("/testRest/{id}/{username}")
    public String testRest(@PathVariable("id") String id, @PathVariable("username") String username){
        System.out.println("id:"+id+",username:"+username);
        return "success";
    }

}
