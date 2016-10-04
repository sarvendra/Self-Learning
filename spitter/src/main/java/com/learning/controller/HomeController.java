package com.learning.controller;

import com.learning.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    public static final int DEFAULT_SPITTLES_PER_PAGE = 25;

    @Autowired
    private SpitterService spitterService;

//    @Autowired
//    public HomeController(SpitterService spitterService){
//        this.spitterService = spitterService;
//    }


    @RequestMapping({"/", "/home"})
    public String showHomePage(Model model) {
        model.addAttribute("spittles", spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE));
        return "home";
    }
}
