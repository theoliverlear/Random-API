package org.theoliverlear.randomnumber.generator;

import java.util.Random;

public class IntNumberGenerator { // Investigate having a parent (maybe abstract)
                               // class for both the API and Website
                               // NumberGenerator classes to inherit from.
                               // Doing this might allow for changing both
                               // packages' classes' name to their respective
                               // naming conventions.
    //------------------------------Variables---------------------------------
    private int randomNumber;
    private int min;
    private int max;
    //------------------------------Constructor-------------------------------
    public IntNumberGenerator() {
        this.min = 0;
        this.max = 100;
        Random random = new Random();
        this.formulateNumber();
    }
    public IntNumberGenerator(int min, int max) {
        this.min = min;
        this.max = max;
        Random random = new Random();
        this.formulateNumber();
    }
    //---------------------------Formulate-Numbers----------------------------
    public void formulateNumber() {
        Random random = new Random();
        if (this.min == 0 && this.max == 100) {
            this.randomNumber = random.nextInt(101); // 101 is exclusive
                                                            // 100 will be the
                                                            // max number
        } else {
            int adjustedMax = this.max - this.min;
            this.randomNumber = random.nextInt(++adjustedMax) + this.min;
        }
    }
    // Min limit is always added to guarantee the number will always be
    // greater than or equal to the min limit. The max limit is subtracted
    // by the min to give it an equal randomness but will not exceed the
    // max limit.
    //--------------------------------Getters---------------------------------
    public int getRandomNumber() {
        return this.randomNumber;
    }
    public int getMin() {
        return this.min;
    }
    public int getMax() {
        return this.max;
    }
    //--------------------------------Setters---------------------------------
    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public void setMax(int max) {
        this.max = max;
    }
}
