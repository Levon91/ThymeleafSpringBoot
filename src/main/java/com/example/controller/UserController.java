package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by levont on 27/10/2016.
 */
@Controller
public class UserController {

    @RequestMapping("/")
    public String indexView() {
        return "index";
    }
}
