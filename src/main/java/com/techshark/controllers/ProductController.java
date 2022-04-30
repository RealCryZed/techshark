package com.techshark.controllers;

import com.techshark.models.Product;
import com.techshark.services.CatalogService;
import com.techshark.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/product/{id}")
    public ModelAndView singleProduct(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("product-by-id");

        /*
            Do some stuff with id
         */

        return mv;
    }

    @GetMapping("/add-product")
    public ModelAndView getAddProductPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("add-product");
        mv.addObject("product", new Product());
        return mv;
    }

    @PostMapping("/add-product")
    public ModelAndView addProduct(Product product) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/add-product");

        product.setRating(0);
        product.setCatalog(catalogService.getCatalogByName(product.getCatalogName()));
        productService.saveProduct(product);

        return mv;
    }
}
