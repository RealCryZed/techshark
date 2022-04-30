package com.techshark.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {

    @GetMapping("/cart")
    public ModelAndView cart() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("cart");

        return mv;
    }

}
