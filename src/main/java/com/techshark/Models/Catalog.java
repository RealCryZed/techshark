package com.techshark.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int catalogId;

    @Column(name="CATALOG_NAME")
    private String catalogName;
}
