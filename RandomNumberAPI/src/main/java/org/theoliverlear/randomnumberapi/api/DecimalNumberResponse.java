package org.theoliverlear.randomnumberapi.api;

public class DecimalNumberResponse {
    private double randomNumber;
    public DecimalNumberResponse(double randomNumber) {
        this.randomNumber = randomNumber;
    }
    //------------------------------Getters-----------------------------------
    public double getRandomNumber() {
        return this.randomNumber;
    }
    //------------------------------Setters-----------------------------------
    public void setRandomNumber(double randomNumber) {
        this.randomNumber = randomNumber;
    }
}
