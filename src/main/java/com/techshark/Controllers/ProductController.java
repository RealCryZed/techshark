package com.techshark.Controllers;

import com.techshark.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @GetMapping("/product/{id}")
    public ModelAndView singleProduct(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("product-by-id");

        /*
            Do some stuff with id
         */

        return mv;
    }
}
