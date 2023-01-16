package com.bottle.study_springboots.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bottle.study_springboots.beans.BoardBean;
import com.bottle.study_springboots.service.DataInfors;

@Controller
@RequestMapping(value = "/notice")
public class NoiceController {
    @RequestMapping(value = {"", "/", "/list"}, method = RequestMethod.GET)  
    public ModelAndView list(ModelAndView mv) {
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> dataInfo = dataInfors.getDataListWithBoardBean();
        mv.addObject("dataInfo", dataInfo);
        mv.setViewName("notice/list");
        return mv;
    }


    @RequestMapping(value = "/edit/{title}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable String title, ModelAndView mv){
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataWithMemberBean(title);
        mv.addObject("boardBean", boardBean);
        mv.setViewName("notice/edit");
        return mv;
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView view(@RequestParam HashMap<String,String> hashMap, ModelAndView mv) {
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.addDataBean(hashMap);
        mv.addObject("boardBean", boardBean);
        mv.setViewName("/notice/view");
        return mv;
    }

    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public ModelAndView getView(@PathVariable String page, ModelAndView mv){
        System.out.println(page);
        mv.setViewName("notice/"+page);
        return mv;
    }
}
