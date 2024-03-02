package com.farmcollector.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.time.LocalDate;

@Entity
public class HarvestedData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String farmName;
    private String season;
    private String cropType;
    private double actualProduct;
    private LocalDate dateHarvested;
}
