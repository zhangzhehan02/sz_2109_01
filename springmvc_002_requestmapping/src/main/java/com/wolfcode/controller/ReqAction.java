package com.wolfcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 */
@Controller   //交给spring框架去创建对象
public class ReqAction {

    @RequestMapping(value = "/req",method = RequestMethod.GET)
    public String req(){
        System.out.println("我是处理get请求的........");
        return "main";
    }
    @RequestMapping(value = "/req",method = RequestMethod.POST)
    public String req1(){
        System.out.println("我是处理post请求的........");
        return "main";
    }
}
