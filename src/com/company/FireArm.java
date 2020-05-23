package com.company;

public abstract class FireArm {
    private Integer maxRange;
    private Integer bulletsPerBurst;
    private Magazine magazine;
    private Recommendation recommendation;

    public FireArm(Integer maxRange, Integer bulletsPerBurst, Integer maxAmmunition) {
        this.maxRange = maxRange;
        this.bulletsPerBurst = bulletsPerBurst;
        this.magazine = new Magazine(maxAmmunition);
    }

    public Integer getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(Integer maxRange) {
        this.maxRange = maxRange;
    }

    public Integer getBulletsPerBurst() {
        return bulletsPerBurst;
    }

    public void setBulletsPerBurst(Integer bulletsPerBurst) {
        this.bulletsPerBurst = bulletsPerBurst;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public Recommendation getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
    }
}


