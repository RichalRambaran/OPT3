package com.company;

public class Rifle extends FireArm {
    public Rifle() {
        super(500, 5);
        setMagazine(new Magazine(90));
        setRecommendation(new Recommended());
    }
}
