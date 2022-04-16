package com.techshark.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @GetMapping("/product/{id}")
    public ModelAndView singleProductPage(ModelAndView mv, @PathVariable Integer id) {
        mv.setViewName("product");

        return mv;
    }
}
