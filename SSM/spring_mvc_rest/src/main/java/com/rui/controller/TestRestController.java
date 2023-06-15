package com.rui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/28 9:21
 * @Version 1.0
 * 查询所有的用户信息：/user     get
 * 根据id查询用户信息：/user/1    get
 * 添加用户信息：/user          post
 * 修改用户信息：/user         put
 * 删除用户信息：/user/1       delete
 *
 * 由于浏览器只支持发送get和post方式的请求，那么该如何发送put和delete请求呢？
 * SpringMVC 提供了 HiddenHttpMethodFilter 帮助我们将 POST 请求转换为 DELETE 或 PUT 请求
 * HiddenHttpMethodFilter 处理put和delete请求的条件：
 * a>当前请求的请求方式必须为post
 * b>当前请求必须传输请求参数_method
 */
@Controller
public class TestRestController {

//    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getAllUser(){
        System.out.println("查询所有的用户信息：/user     get");
        return "success";

    }

//    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("根据id查询用户信息：/user/" + id  + "    get");
        return "success";
    }

//    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @PostMapping("/user")
    public String insertUser(){
        System.out.println("添加所有的用户信息：/user     post");
        return "success";
    }

//    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @PutMapping("/user")
    public String updateUser(){
        System.out.println("修改用户信息：/user     put");
        return "success";
    }

//    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("user/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println("删除用户信息：/user/" + id + "    put");
        return "success";
    }


}
