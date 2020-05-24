package com.company;

public abstract class Compartment {
    private Integer maxCapacity;

    public Compartment(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public abstract Integer getCurrentCapacity();

    public abstract void fillToMaxCapacity();
}
