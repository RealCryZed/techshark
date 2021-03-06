package com.techshark.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PROD_ID")
    private int productId;

    @Column(name="PROD_NAME")
    private String name;

    @Column(name="PROD_PRICE")
    private int price;

    @Column(name="PROD_DESCRIPTION")
    private String description;

    @Column(name="PROD_RATING")
    private long rating;

    @Column(name="PROD_INSTOCK")
    private int inStock;

    @JoinColumn(name = "CATALOG_NAME", referencedColumnName = "CATALOG_NAME")
    @ManyToOne
    private Catalog catalog;

    @Transient
    private String catalogName;
}
