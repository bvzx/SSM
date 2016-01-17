package com.app.project.controllers;

import com.app.project.beans.User;
import com.app.project.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wuhao on 2016/1/14.
 */

@Controller
@RequestMapping("/user")
public class CommentController {

    @Resource
    UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(User user, Model model){
        List<User> userList=userService.selectByUser(user);
        if (userList.size()==1){
            model.addAttribute("user",userList.get(0));
            return new ModelAndView("index");
        }
        model.addAttribute("error","用户名密码错误！！！");
        return new ModelAndView("login");
    };

}
