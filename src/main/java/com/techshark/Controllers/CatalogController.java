package com.techshark.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CatalogController {

    @GetMapping("/catalog")
    public ModelAndView catalog(ModelAndView mv) {
        mv.setViewName("catalog");

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
}
