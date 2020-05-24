package com.company;

import java.util.ArrayList;

public class FiringSquad {
    private Integer maxSize;
    private Boolean aimingAtTarget;
    private Target target;
    private ArrayList<Soldier> soldiers;

    public FiringSquad() {
        this.maxSize = 10;
        this.aimingAtTarget = false;
        this.soldiers = new ArrayList<>(maxSize);
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public Integer getCurrentSize() {
        return soldiers.size();
    }

    public Boolean getAimingAtTarget() {
        return aimingAtTarget;
    }

    public void setAimingAtTarget(Boolean aimingAtTarget) {
        this.aimingAtTarget = aimingAtTarget;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public ArrayList<Soldier> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(ArrayList<Soldier> soldiers) {
        this.soldiers = soldiers;
    }
}
