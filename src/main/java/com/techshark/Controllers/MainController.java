package com.techshark.Controllers;

import com.techshark.Services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/")
    public ModelAndView mainPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main");
        mv.addObject("catalogs", catalogService.getAllCatalogs());

        return mv;
    }
}