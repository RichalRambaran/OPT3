package com.company;

public class MachineGun extends FireArm {
    public MachineGun() {
        super(200, 10, 200);
        setRecommendation(new NotRecommended());
    }
}
