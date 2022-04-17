package com.techshark.Controllers;

import com.techshark.Models.Catalog;
import com.techshark.Services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/catalog")
    @ResponseBody
    public ModelAndView catalog(ModelAndView mv) {
        mv.setViewName("catalog");
        mv.addObject("catalog", catalogService.getAllCatalogs());

        return mv;
    }

    @GetMapping("/catalog/{id}")
    public ModelAndView specificalCatalog(ModelAndView mv, @PathVariable Integer id) {
        mv.setViewName("catalog-by-name");
        /*
            Do some stuff with id
         */
        return mv;
    }

    @GetMapping("/add-catalog")
    public ModelAndView getAddCatalogPage(ModelAndView mv) {
        mv.setViewName("add-catalog");
        mv.addObject("catalog", new Catalog());
        return mv;
    }

    @PostMapping("/add-catalog")
    public ModelAndView addCatalog(ModelAndView mv, Catalog catalog) {
        catalogService.addCatalog(catalog);

        mv.setViewName("main");
        return mv;
    }
}
