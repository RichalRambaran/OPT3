package com.company;

public class Target {
    private Integer distance;
    private Integer bulletHits;
    private Boolean alive;
    private Integer threshold;

    public Target(Integer distance, Integer threshold) {
        this.distance = distance;
        this.bulletHits = 0;
        this.alive = true;
        this.threshold = threshold;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getBulletHits() {
        return bulletHits;
    }

    public void setBulletHits(Integer bulletHits) {
        this.bulletHits = bulletHits;
        checkIfAlive();
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    private void checkIfAlive() {
        if (bulletHits >= threshold) {
            alive = false;
        }
    }
}
