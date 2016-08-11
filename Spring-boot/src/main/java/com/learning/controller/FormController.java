package com.learning.controller;

import com.learning.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    @ModelAttribute("allJobTypes")
    public List<Profile.JobType> populateJobTypes() {
        return Arrays.asList(Profile.JobType.ALL);
    }

    @ModelAttribute("allSex")
    public List<Profile.Sex> populateSex() {
        return Arrays.asList(Profile.Sex.ALL);
    }

    @RequestMapping(value="/profile", method=RequestMethod.GET)
    public String profileForm(Model model) {
        Profile profile = new Profile();
        profile.setId("1223");
        Profile.Name name = new Profile.Name();
        name.setFirstName("Sarvendra");
        name.setLastName("Anand");
        profile.setName(name);
        profile.setJobTypes(null);
        model.addAttribute("profile", profile);
        return "profile";
    }

    @RequestMapping(value="/profile", method=RequestMethod.POST)
    public String profileSubmit(@ModelAttribute Profile profile, Model model) {
        model.addAttribute("profile", profile);
        return "result";
    }

    @RequestMapping("/status")
    @ResponseBody
    public String status(HttpServletResponse response) {
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        return "alive";
    }
}
