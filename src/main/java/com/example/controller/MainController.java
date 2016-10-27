package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by levont on 27/10/2016.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginView(){
        return "login";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registrationView(){
        return "registration";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(){
        System.out.println("----------------asdfasdfsa");
        return "redirect:index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(){
        System.out.println("----------------asdfasdfsa");
        return "redirect:/";
    }
}
