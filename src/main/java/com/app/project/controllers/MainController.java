package com.app.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wuhao on 2016/1/14.
 */

@Controller
public class MainController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView("login");
    };
}
