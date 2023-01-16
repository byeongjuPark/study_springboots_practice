package com.bottle.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = {"", "/", "/main"})    // http://localhost:8080/homejsp
    public String main(){
        int i = 0;
        return "main";
    }
    @RequestMapping(value = "/home")    // http://localhost:8080/homejsp
    public void home(){
        int i = 0;
    }
    @RequestMapping(value = "/homejsp")    // http://localhost:8080/homejsp
    public String homejsp(){
        int i = 0;
        return "home";
    }
    @RequestMapping(value = "/homehtml")    // http://localhost:8080/homehtml
    public String homehtml(){
        int i = 0;
        return "home.html";
    }
}