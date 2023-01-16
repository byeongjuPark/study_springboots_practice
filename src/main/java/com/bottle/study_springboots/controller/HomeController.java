package com.bottle.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


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

    @RequestMapping(value = "/jstlformats")    // http://localhost:8080/homehtml
    public String jstlformats(){
        
        return "jstl_formats";
    }

    @RequestMapping(value = "/user/{age}/{name}", method = RequestMethod.GET)
    public ModelAndView getView(@PathVariable String age, @PathVariable String name, ModelAndView mv){
        System.out.println(age+"살" + name);
        mv.setViewName("board/form");
        return mv;
    }
    
}