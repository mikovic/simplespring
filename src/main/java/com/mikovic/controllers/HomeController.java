package com.mikovic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String hello(Model uiModel) {
        uiModel.addAttribute("name", "World!");
        return "index";
    }
}
