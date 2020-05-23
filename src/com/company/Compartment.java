package com.company;

public abstract class Compartment {
    private Integer maxCapacity;
    private Integer currentCapacity;

    public Compartment(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = maxCapacity;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Integer getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(Integer currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
}
