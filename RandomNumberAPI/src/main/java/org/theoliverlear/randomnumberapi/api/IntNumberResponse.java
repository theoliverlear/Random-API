package org.theoliverlear.randomnumberapi.api;

public class IntNumberResponse {
    private int number;
    public IntNumberResponse(int number) {
        this.number = number;
    }
    //------------------------------Getters-----------------------------------
    public int getNumber() {
        return this.number;
    }
    //------------------------------Getters-----------------------------------
    public void setNumber(int number) {
        this.number = number;
    }
}
