package org.theoliverlear.randomnumberapi.api;

import java.text.DecimalFormat;

public class DecimalNumberGenerator {
    private double randomNumber;
    private double min;
    private double max;
    private int decimalPlaces;
    private DecimalFormat decimalFormat;
    public DecimalNumberGenerator(double min, double max, int decimalPlaces) {
        this.min = min;
        this.max = max;
        this.decimalPlaces = decimalPlaces;
        this.decimalFormat = new DecimalFormat("#." + "#".repeat(this.decimalPlaces));
        this.formulateNumber();
    }
    public void formulateNumber() {
        double tempRandomNumber = Math.random() * (this.max - this.min) + this.min;
        this.randomNumber = Double.parseDouble(this.decimalFormat.format(tempRandomNumber));
    }

    //------------------------------Getters-----------------------------------
    public double getRandomNumber() {
        return this.randomNumber;
    }
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
    public void setRandomNumber(double randomNumber) {
        this.randomNumber = randomNumber;
    }
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
