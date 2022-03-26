package ar.edu.itba.paw.webapp.controller;

import ar.edu.itba.paw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    private UserService us;

    @Autowired
    public HelloWorldController(final UserService us) {
        this.us = us;
    }

    @RequestMapping("/")
    public ModelAndView helloWorld() {
        final ModelAndView mav = new ModelAndView("index");

        mav.addObject("greeting", us.getUsername());
        return mav;
    }

    @RequestMapping("/chau")
    public ModelAndView goodbyeWorld() {
        final ModelAndView mav = new ModelAndView("byebye");

        mav.addObject("greeting", us.getUsername());
        return mav;
    }

}
