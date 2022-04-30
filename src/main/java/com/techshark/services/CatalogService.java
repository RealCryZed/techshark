package com.techshark.services;

import com.techshark.interfaces.CatalogRepo;
import com.techshark.models.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Catalog getCatalogById(Integer id) {
        return catalogRepo.getById(id);
    }

    public Catalog getCatalogByName(String catalogName) {
        return catalogRepo.findCatalogByCatalogName(catalogName);
    }
}
