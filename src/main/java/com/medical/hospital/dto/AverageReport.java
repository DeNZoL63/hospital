package com.medical.hospital.dto;

public class AverageReport {
    private int quantity;
    private int averageTemperature;

    public AverageReport(int quantity, int averageTemperature) {
        this.quantity = quantity;
        this.averageTemperature = averageTemperature;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
}
