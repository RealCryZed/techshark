package com.techshark.Controllers;

import com.techshark.Models.Catalog;
import com.techshark.Services.CatalogService;
import com.techshark.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @Autowired
    private ProductService productService;

    @GetMapping("/catalogs")
    @ResponseBody
    public ModelAndView catalog() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("catalog");
        mv.addObject("catalogs", catalogService.getAllCatalogs());

        return mv;
    }

    @GetMapping("/catalog/{id}")
    public ModelAndView specificalCatalog(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("catalog-by-name");
        mv.addObject("products", productService.getAllProductsById(id));
        mv.addObject("specificalCatalog", catalogService.getCatalogById(id));

        return mv;
    }

    @GetMapping("/add-catalog")
    public ModelAndView getAddCatalogPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("add-catalog");
        mv.addObject("catalog", new Catalog());
        return mv;
    }

    @PostMapping("/add-catalog")
    public ModelAndView addCatalog(Catalog catalog) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/add-catalog");

        catalogService.addCatalog(catalog);

        return mv;
    }
}
