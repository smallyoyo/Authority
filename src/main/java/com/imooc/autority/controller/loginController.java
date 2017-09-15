package com.imooc.autority.controller;

import com.imooc.autority.entity.authUser;
import com.imooc.autority.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
/**
 * Created by HW520 on 2017/9/3.
 */
@RestController
public class loginController {

    @Autowired
    private loginService loginService;

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView=new ModelAndView("login");
        return  modelAndView;
    }

    @PostMapping("/singin")
    public  ModelAndView signin(HttpServletRequest request, HttpServletResponse response){
        try {
            request.setCharacterEncoding("utf-8");
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            authUser authuser=loginService.login(username,password);
            if(authuser!=null){
                request.getSession().setAttribute("username",username);
                ModelAndView modelAndView=new ModelAndView("home");
                return  modelAndView;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        ModelAndView modelAndView=new ModelAndView("login");
        modelAndView.addObject("msg","用户名或密码错误！");
        return modelAndView;
    }

}
