package com.shz.microservices.limitsservice.bean;

public class Limits {

    private int max;
    private int min;

    @Override
    public String toString() {
        return "Limits{" +
                "max=" + max +
                ", min=" + min +
                '}';
    }

    public Limits(int min, int max) {
        super();
        this.max = max;
        this.min = min;
    }

    public Limits() {
        super();
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
