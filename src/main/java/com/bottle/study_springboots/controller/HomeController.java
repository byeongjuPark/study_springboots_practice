package com.bottle.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = {"", "/", "/main"})
    public String main(){
        System.out.println("main");
        return "WEB-INF/views/main.jsp"; //jasper가 해석해서 인식
    }

    @RequestMapping(value = "/home") // http://localhost:8080/home
    public void home(){
        System.out.println("Active HomeController");
    }

    @RequestMapping(value = "/homejsp") // http://localhost:8080/home
    public String homejsp(){
        System.out.println("Active HomeController");
        return "WEB-INF/views/home.jsp"; //jasper가 해석해서 인식
    }

    @RequestMapping(value = "/homehtml") // http://localhost:8080/home
    public String homehtml(){
        System.out.println("Active HomeController");
        return "WEB-INF/views/home.html"; //html은 해석 안함
    }
}
