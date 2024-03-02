package com.farmcollector.dto;

public class CropReportDTO {

    private String cropType;
    private String season;
    private double expectedProduct;
    private double actualProduct;

    // Constructor
    public CropReportDTO(String cropType, String season, double expectedProduct, double actualProduct) {
        this.cropType = cropType;
        this.season = season;
        this.expectedProduct = expectedProduct;
        this.actualProduct = actualProduct;
    }

    // Getters and setters
    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getExpectedProduct() {
        return expectedProduct;
    }

    public void setExpectedProduct(double expectedProduct) {
        this.expectedProduct = expectedProduct;
    }

    public double getActualProduct() {
        return actualProduct;
    }

    public void setActualProduct(double actualProduct) {
        this.actualProduct = actualProduct;
    }
}

