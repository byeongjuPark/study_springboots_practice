package com.bottle.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
    @RequestMapping(value = "/board/form")
    public String form(){
        System.out.println("Active BoardController");
        return "/WEB-INF/views/board/form.jsp";
    }
}
