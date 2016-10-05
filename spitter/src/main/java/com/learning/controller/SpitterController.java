package com.learning.controller;

import com.learning.model.Spitter;
import com.learning.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("/spitters")
public class SpitterController {
    @Autowired
    private SpitterService spitterService;

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showProfile(@PathVariable String username,
                                         Model model) {
        Spitter spitter = spitterService.getSpitterByUsername(username);
        model.addAttribute("spitter", spitter);
        return "profile";
    }

    @RequestMapping(method = RequestMethod.GET, params = "new")
    public String register(Model model) {
        model.addAttribute("spitter", new Spitter());
        return "registerForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String registerUser(@Valid Spitter spitter, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registerForm";
        }
        spitterService.addSpitter(spitter);
        return "redirect:/spitters/" + spitter.getUsername();
    }
}
