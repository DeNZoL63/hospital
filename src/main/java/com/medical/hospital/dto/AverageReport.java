package com.medical.hospital.dto;

import java.math.BigDecimal;

public class AverageReport {
    private Long quantity;
    private BigDecimal averageTemperature;

    public AverageReport(Long quantity, BigDecimal averageTemperature) {
        this.quantity = quantity;
        this.averageTemperature = averageTemperature;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(BigDecimal averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
}
