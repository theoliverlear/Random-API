package org.theoliverlear.randomnumberapi.model;

import java.util.Random;

public class RandomHex {
    String hex;
    char[] hexArray = "0123456789ABCDEF".toCharArray();
    public RandomHex() {
        this.hex = "#";
        this.generateHex();
    }
    public void generateHex() {
        for (int i = 0; i < 6; i++) {
            Random randomHex = new Random();
            int hexLength = this.hexArray.length;
            this.hex += String.valueOf(this.hexArray[randomHex.nextInt(hexLength)]);
        }
    }
    //------------------------------Getters-----------------------------------
    public String getHex() {
        return this.hex;
    }
}
