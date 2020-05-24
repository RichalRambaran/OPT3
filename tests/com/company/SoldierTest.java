package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {
    @Test
    public void MCDCTest() {
        Target target1 = new Target(50, 60);
        Target target2 = new Target(501, 60);
        Target target3 = new Target(50, 60);
        target3.setBulletHits(200);

        Rifle rifle = new Rifle(); // 500 range, 5 bullets per burst, 90 max ammunition
        Soldier soldier = new Soldier("James");
        soldier.setFireArm(rifle);

        soldier.shootBurst(target1); // O1 reached
        soldier.shootBurst(target2); // O2 reached
        soldier.shootBurst(target3); // O3 reached

        rifle.getMagazine().setCurrentAmmunition(1);

        soldier.shootBurst(target1); // O4 reached
    }
}