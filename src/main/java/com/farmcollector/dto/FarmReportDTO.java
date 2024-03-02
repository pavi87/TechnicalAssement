package com.farmcollector.dto;

import java.util.Map;

public class FarmReportDTO {

    private String farmName;
    private String season;
    private Map<String, Double> expectedProducts;
    private Map<String, Double> actualProducts;

    // Constructor
    public FarmReportDTO(String farmName, String season, Map<String, Double> expectedProducts, Map<String, Double> actualProducts) {
        this.farmName = farmName;
        this.season = season;
        this.expectedProducts = expectedProducts;
        this.actualProducts = actualProducts;
    }

    // Getters and setters
    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Map<String, Double> getExpectedProducts() {
        return expectedProducts;
    }

    public void setExpectedProducts(Map<String, Double> expectedProducts) {
        this.expectedProducts = expectedProducts;
    }

    public Map<String, Double> getActualProducts() {
        return actualProducts;
    }

    public void setActualProducts(Map<String, Double> actualProducts) {
        this.actualProducts = actualProducts;
    }
}
