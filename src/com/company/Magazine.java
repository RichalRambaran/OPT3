package com.company;

public class Magazine {
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
