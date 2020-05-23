package com.company;

public class Target {
    private Integer distance;
    private Integer bulletHits;
    private Boolean alive;

    public Target(Integer distance) {
        this.distance = distance;
        this.bulletHits = 0;
        this.alive = true;
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
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }
}
