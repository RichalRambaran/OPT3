package com.company;

public class Supplier extends Troop {
    public Supplier(String name) {
        super(name);
    }

    public void reStockCompartments() {
        FireArmDeposit.getFireArmDeposit().getMachineGunCompartment().fillToMaxCapacity();
        FireArmDeposit.getFireArmDeposit().getRifleCompartment().fillToMaxCapacity();
        System.out.println(getName() + " has restocked all compartments of the firearm deposit.");
    }
}
