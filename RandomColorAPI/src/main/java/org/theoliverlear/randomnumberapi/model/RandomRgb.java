package org.theoliverlear.randomnumberapi.model;

import java.util.Random;

public class RandomRgb {
    private int red;
    private int green;
    private int blue;
    public RandomRgb() {
        this.generateColor();
    }
    public void generateColor() {
        Random randomColor = new Random();
        this.red = randomColor.nextInt(256);
        this.green = randomColor.nextInt(256);
        this.blue = randomColor.nextInt(256);
    }
    //------------------------------Getters-----------------------------------
    public int getRed() {
        return this.red;
    }
    public int getGreen() {
        return this.green;
    }
    public int getBlue() {
        return this.blue;
    }
}
