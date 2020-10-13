package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@SessionAttributes(value={"username","msg2"},types = Integer.class)
public class TestController {

    @RequestMapping("/toTest")
    public String toTest(){
        System.out.println("totest ...");
        return "success";
    }

    @RequestMapping("/toTest1")
    public String toTest1(Map<String,String> map){
        map.put("msg"," hello spring mvc1");
        System.out.println(map.getClass());
        return "success";
    }
    @RequestMapping("/toTest2")
    public String toTest2(Model model){
        model.addAttribute("msg"," hello spring mvc2");
        System.out.println(model.getClass());
        return "success";
    }
    @RequestMapping("/toTest3")
    public String toTest3(ModelMap mmp){
        mmp.addAttribute("msg"," hello spring mvc3");
        System.out.println(mmp.getClass());
        return "success";
    }

    @RequestMapping("/toTest4")
    public ModelAndView toTest4(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        mv.addObject("msg"," hello spring mvc modelandview");
        return mv;
    }

    @RequestMapping("/toSession")
    public String toSession(Model model){
        model.addAttribute("username"," binding");
        return "success";
    }
}
