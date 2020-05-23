package com.company;

public class MachineGun extends FireArm {
    public MachineGun() {
        super(200, 15);
        setMagazine(new Magazine(210));
        setRecommendation(new NotRecommended());
    }
}
