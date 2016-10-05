package com.learning.controller;

import com.learning.service.SpitterService;
import com.learning.service.SpittleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    public static final int DEFAULT_SPITTLES_PER_PAGE = 25;

    @Autowired
    private SpittleService spittleService;

    @Autowired
    private SpitterService spitterService;

    @RequestMapping({"/", "/home"})
    public String showHomePage(Model model) {
        model.addAttribute("spittles", spittleService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE));
        return "home";
    }
}
