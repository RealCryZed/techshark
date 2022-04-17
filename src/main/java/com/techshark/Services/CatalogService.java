package com.techshark.Services;

import com.techshark.Interface.CatalogRepo;
import com.techshark.Models.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private CatalogRepo catalogRepo;

    public void addCatalog(Catalog catalog) {
        catalogRepo.save(catalog);
    }

    public List<Catalog> getAllCatalogs() {
        return catalogRepo.findAll();
    }
}
