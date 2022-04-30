package com.techshark.services;

import com.techshark.interfaces.ProductRepo;
import com.techshark.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product getSingleProduct(Integer id) {
        return productRepo.getById(id);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public List<Product> getAllProductsById(Integer id) {
        return productRepo.findAllByCatalog(id);
    }

    public void saveProduct(Product product) {
        productRepo.save(product);
    }
}
