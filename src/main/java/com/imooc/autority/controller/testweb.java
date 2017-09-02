package com.imooc.autority.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by HW520 on 2017/9/2.
 */
@Controller
@RequestMapping(value = "/hello")
public class testweb {
    @RequestMapping("")
    public ModelAndView testw(){
      ModelAndView modelAndView=new ModelAndView("/hello");
      modelAndView.addObject("hello","HelloSpringBoot");
      return  modelAndView;
    }
}
