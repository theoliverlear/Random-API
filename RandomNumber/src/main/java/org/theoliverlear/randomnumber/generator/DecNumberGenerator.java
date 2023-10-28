package org.theoliverlear.randomnumber.generator;

import java.util.Random;

public class DecNumberGenerator {
     //------------------------------Variables---------------------------------
    private double randomNumber;
    private double min;
    private double max;
    private int decimalPlaces;
    //------------------------------Constructor-------------------------------
    public DecNumberGenerator() {
        this.min = 0;
        this.max = 100;
        this.decimalPlaces = 2;
        this.formulateNumber();
    }
    public DecNumberGenerator(double min, double max, int decimalPlaces) {
        this.min = min;
        this.max = max;
        this.decimalPlaces = decimalPlaces;
        this.formulateNumber();
    }
    //---------------------------Formulate-Numbers----------------------------
    public void formulateNumber() {
        Random random = new Random();
        String leftDecimal = String.valueOf(this.max).split("\\.")[0];
        int leftDecimalInt = random.nextInt(Integer.parseInt(leftDecimal));
        int[] rightDecimal = new int[this.decimalPlaces];
        for (int i = 0; i < this.decimalPlaces; i++) {
            rightDecimal[i] = random.nextInt(10);
        }
        String rightDecimalString = "";
        for (int num : rightDecimal) {
            rightDecimalString += String.valueOf(num);
        }
        String fullDecimalString = String.valueOf(leftDecimalInt) + "."
                                   + rightDecimalString;
        this.randomNumber = Double.parseDouble(fullDecimalString);

    }
    // Min limit is always added to guarantee the number will always be
    // greater than or equal to the min limit. The max limit is subtracted
    // by the min to give it an equal randomness but will not exceed the
    // max limit.
    //--------------------------------Getters---------------------------------
    public double getRandomNumber() {
        return this.randomNumber;
    }
    public double getMin() {
        return this.min;
    }
    public double getMax() {
        return this.max;
    }
    //--------------------------------Setters---------------------------------
    public void setRandomNumber(double randomNumber) {
        this.randomNumber = randomNumber;
    }
    public void setMin(double min) {
        this.min = min;
    }
    public void setMax(double max) {
        this.max = max;
    }
}
