package com.firstprogect.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Home page");
        model.addAttribute("img1", "https://www.youtube.com/watch?v=1Ne1hqOXKKI");
        return "home";
    }

//    @GetMapping("/blog")
//    public String blog(Model model) {
//        return "blog-main";
//    }

    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }
}

