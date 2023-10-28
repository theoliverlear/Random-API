package org.theoliverlear.randomnumberapi.api;

public class IntNumberRequest {
    private int min;
    private int max;
    public IntNumberRequest(int min, int max) {
        this.min = min;
        this.max = max;
    }
    //------------------------------Getters-----------------------------------
    public int getMin() {
        return this.min;
    }
    public int getMax() {
        return this.max;
    }
    //------------------------------Setters-----------------------------------
    public void setMin(int min) {
        this.min = min;
    }
    public void setMax(int max) {
        this.max = max;
    }
}
