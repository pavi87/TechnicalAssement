package com.farmcollector.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Getter
@Setter
@Entity
public class PlantedData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String farmName;
    private String season;
    private double plantingArea;
    private String cropType;
    private double expectedProduct;
    private LocalDate datePlanted;

    public PlantedData() {

    }
}
