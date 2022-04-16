package com.techshark.Models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue
    @Column(name="PROD_ID")
    private int id;

    @Column(name="PROD_PRICE")
    private int price;

    @Column(name="PROD_DESCRIPTION")
    private String description;

    @Column(name="PROD_RATING")
    private long rating;

    @Column(name="PROD_INSTOCK")
    private int inStock;

    /* add categories in future */
}
