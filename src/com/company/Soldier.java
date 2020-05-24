package com.company;

public class Soldier extends Troop {
    private FireArm fireArm;

    public Soldier(String name) {
        super(name);
    }

    public void grabMachineGun() {
        int index = 0;
        if (FireArmDeposit.getFireArmDeposit().getMachineGunCompartment().getMachineGuns().get(index) != null) {
            fireArm = FireArmDeposit.getFireArmDeposit().getMachineGunCompartment().getMachineGuns().get(index);
            FireArmDeposit.getFireArmDeposit().getMachineGunCompartment().getMachineGuns().remove(index);
        }
        else {
            System.out.println("The machine gun compartment is empty, you couldn't grab a machine gun");
        }
    }

    public void grabRifle() {
        int index = 0;
        if (FireArmDeposit.getFireArmDeposit().getRifleCompartment().getRifles().get(index) != null) {
            fireArm = FireArmDeposit.getFireArmDeposit().getRifleCompartment().getRifles().get(index);
            FireArmDeposit.getFireArmDeposit().getRifleCompartment().getRifles().remove(index);
        }
        else {
            System.out.println("The rifle compartment is empty, you couldn't grab a rifle");
        }
    }

    public void shootBurst() {

    }

    public void reload() {

    }
}
