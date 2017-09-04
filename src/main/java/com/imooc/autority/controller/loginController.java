package com.imooc.autority.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by HW520 on 2017/9/3.
 */
@RestController
public class loginController {
    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView=new ModelAndView("login");
        return  modelAndView;
    }

    public  String  loginIn(){
        return  "null";
    }

}
