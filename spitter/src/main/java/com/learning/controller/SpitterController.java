package com.learning.controller;

import com.learning.model.Spitter;
import com.learning.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/spitters")
public class SpitterController {
    @Autowired
    private SpitterService spitterService;

    @RequestMapping(value = "/spitter", method = RequestMethod.GET)
    public String showProfile(@RequestParam("spitter") String username,
                                         Model model) {
        Spitter spitter = spitterService.getSpitterByUsername(username);
        model.addAttribute("spitter", spitter);
        return "profile";
    }
}
