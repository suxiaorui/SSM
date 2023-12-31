package com.rui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/27 19:50
 * @Version 1.0
 *
 * 1 使用ModelAndView向request域对象共享数据
 * 2 使用Model向request域对象共享数据
 * 3 使用ModelMap向request域对象共享数据
 * 4 使用map向request域对象共享数据
 *
 * Model、ModelMap、Map类型的参数其实本质上都是 BindingAwareModelMap 类型的
 * public interface Model{}
 * public class ModelMap extends LinkedHashMap<String, Object> {}
 * public class ExtendedModelMap extends ModelMap implements Model {}
 * public class BindingAwareModelMap extends ExtendedModelMap {}
 */
@Controller
public class TestScopeController {

    @RequestMapping("/test/mav")
    public ModelAndView testMAV(){
        //向请求域共享数据
        ModelAndView mav = new ModelAndView();
        mav.addObject("testRequestScope","hello,ModelAndView");
        //设置视图，实现页面跳转
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/test/model")
    public String testModel(Model model){
        model.addAttribute("testRequestScope", "hello,Model");
        return "success";
    }

    @RequestMapping("/test/modelMap")
    public String testModel(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope", "hello,ModelMap");
        return "success";
    }

    @RequestMapping("/test/map")
    public String testMap(Map<String,Object> map){
        map.put("testRequestScope", "hello,Map");
        return "success";
    }

    @RequestMapping("/test/session")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope", "hello,session");
        return "success";
    }

    @RequestMapping("/test/application")
    public String testApplication(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplicationScope", "hello,application");
        return "success";
    }



}
