package com.company;

public class Main {
    public static void main(String[] args) {
        // ready to start
        System.out.println(FireArmDeposit.getFireArmDeposit().getMachineGunCompartment().getCurrentCapacity());
        FireArmDeposit.getFireArmDeposit().getMachineGunCompartment().getMachineGuns().remove(7);
        FireArmDeposit.getFireArmDeposit().getMachineGunCompartment().getMachineGuns().remove(7); // elements shift
        System.out.println(FireArmDeposit.getFireArmDeposit().getMachineGunCompartment().getCurrentCapacity());
    }
}