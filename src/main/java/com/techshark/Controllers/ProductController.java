package com.techshark.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @GetMapping("/products")
    public ModelAndView products(ModelAndView mv) {
        mv.setViewName("products");

        return mv;
    }

    @GetMapping("/product/{id}")
    public ModelAndView singleProduct(ModelAndView mv, @PathVariable Integer id) {
        mv.setViewName("product-by-id");

        /*
            Do some stuff with id
         */

        return mv;
    }
}
