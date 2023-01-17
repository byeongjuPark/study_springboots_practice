package com.bottle.study_springboots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bottle.study_springboots.dao.CommonCodeDao;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController {

    @Autowired
    CommonCodeDao CommonCodeDao;

    @RequestMapping(value = "/list")
    public ModelAndView list(ModelAndView mv){
        
        Object list = CommonCodeDao.getList();
        mv.addObject("commonCodeDao", list);
        mv.setViewName("commonCode/list");
        return mv;
    }
}
