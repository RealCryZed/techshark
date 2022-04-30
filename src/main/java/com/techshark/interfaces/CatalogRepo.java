package com.techshark.interfaces;

import com.techshark.models.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepo extends JpaRepository<Catalog, Integer> {

    Catalog findCatalogByCatalogName(String catalogName);
}