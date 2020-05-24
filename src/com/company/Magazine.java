package com.company;

public class Magazine { // making an separate class for magazine instead of lumping it together with firearm prevents large class
    private Integer maxAmmunition;
    private Integer currentAmmunition;

    public Magazine(Integer maxAmmunition) {
        this.maxAmmunition = maxAmmunition;
        this.currentAmmunition = maxAmmunition;
    }

    public Integer getMaxAmmunition() {
        return maxAmmunition;
    }

    public void setMaxAmmunition(Integer maxAmmunition) {
        this.maxAmmunition = maxAmmunition;
    }

    public Integer getCurrentAmmunition() {
        return currentAmmunition;
    }

    public void setCurrentAmmunition(Integer currentAmmunition) {
        this.currentAmmunition = currentAmmunition;
    }
}
