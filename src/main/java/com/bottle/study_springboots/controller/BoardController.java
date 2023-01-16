package com.bottle.study_springboots.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bottle.study_springboots.beans.BoardBean;
import com.bottle.study_springboots.service.DataInfors;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
    @RequestMapping(value = "/edit", method = RequestMethod.POST)   
    public ModelAndView edit(ModelAndView modelAndView) { 
        modelAndView.setViewName("board/edit");
        return modelAndView;
    }

    @RequestMapping(value = {"", "/", "/list"}, method = RequestMethod.GET)  
    public ModelAndView list() {
        System.out.println("list()CTR active");
        ModelAndView modelAndView = new ModelAndView();
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();

        modelAndView.addObject("boardList", boardList);
        modelAndView.setViewName("board/list");

        return modelAndView;
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)  
    public ModelAndView view(@RequestParam String title, ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataWithMemberBean(title);

        modelAndView.addObject("boardBean", boardBean);
        modelAndView.setViewName("board/view");

        return modelAndView;
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)    
    public ModelAndView form(ModelAndView modelAndView) {
        System.out.println("board/form");
        modelAndView.setViewName("board/form");

        return modelAndView;
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)    
    public ModelAndView save(@RequestParam HashMap<String, String> params, ModelAndView modelAndView) {
        modelAndView.setViewName("board/list");
        
        return modelAndView;
    }
}
