package com.example.web_apppPhani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

    @RequestMapping("web_appPhani")
    public ModelAndView displayInfo(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("message","This my First Web App of Spring Boot Journey");
        mav.setViewName("index");

        return mav;
    }
}
