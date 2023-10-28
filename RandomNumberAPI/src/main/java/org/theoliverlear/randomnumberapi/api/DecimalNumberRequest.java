package org.theoliverlear.randomnumberapi.api;

public class DecimalNumberRequest {
    private double min;
    private double max;
    private int decimalPlaces;
    public DecimalNumberRequest(double min, double max, int decimalPlaces) {
        this.min = min;
        this.max = max;
        this.decimalPlaces = decimalPlaces;
    }
    //------------------------------Getters-----------------------------------
    public double getMin() {
        return this.min;
    }
    public double getMax() {
        return this.max;
    }
    public int getDecimalPlaces() {
        return this.decimalPlaces;
    }
    //------------------------------Setters-----------------------------------
    public void setMin(double min) {
        this.min = min;
    }
    public void setMax(double max) {
        this.max = max;
    }
    public void setDecimalPlaces(int decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }
}
