package com.wolfcode.controller;

import com.wolfcode.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@Controller
public class DataSubmitAction {

    /**
     *    姓名:<input name="myname"><br>
     *       年龄:<input name="age"><br>
     */
    @RequestMapping("/one")
    public String one(String myname,int age){
        System.out.println("myname="+myname+",age="+(age+100));
        return "main";
    }

    /**
     *     private String name;
     *     private int age;
     */
    @RequestMapping("/two")
    public String two(Users u){
        System.out.println(u);
        return "main";
    }
    /**
     *<a href="${pageContext.request.contextPath}/three/张三/22.action">动态提交</a>
     */
    @RequestMapping("/three/{uname}/{uage}")
    public String three(
            @PathVariable("uname")
            String name,
            @PathVariable("uage")
            int age){
        System.out.println("name="+name+",age="+(age+100));
        return "main";
    }

    /**
     *姓名:<input name="name"><br>
     *年龄:<input name="age"><br>
     *
     */
    @RequestMapping("/four")
    public String four(
            @RequestParam("name")
            String uname,
            @RequestParam("age")
            int uage) {
        System.out.println("uname="+uname+",uage="+(uage+100));
     return "main";
    }

    @RequestMapping("/five")
    public String five(HttpServletRequest request){
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println("name="+name+",age="+(age+100));
        return "main";
    }
}
