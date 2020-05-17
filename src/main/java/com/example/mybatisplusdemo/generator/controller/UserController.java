package com.example.mybatisplusdemo.generator.controller;


import com.example.mybatisplusdemo.generator.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author daiwenxiang
 * @since 2020-05-17
 */
@Controller
@RequestMapping("/generator/user")
public class UserController {

    @Resource
    private UserService service;

    @GetMapping("index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", service.list());
        return modelAndView;
    }
}

