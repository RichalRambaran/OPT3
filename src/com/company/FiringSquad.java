package com.company;

public class FiringSquad {
    private Integer maxSize;
    private Integer currentSize;
    private Boolean aimingAtTarget;

    public FiringSquad() {
        this.maxSize = 10;
        this.currentSize = 0;
        this.aimingAtTarget = false;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public Integer getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }

    public Boolean getAimingAtTarget() {
        return aimingAtTarget;
    }

    public void setAimingAtTarget(Boolean aimingAtTarget) {
        this.aimingAtTarget = aimingAtTarget;
    }
}
