package com.company;

public class Rifle extends FireArm {
    public Rifle() {
        super(400, 5, 90);
        setRecommendation(new Recommended());
    }
}
