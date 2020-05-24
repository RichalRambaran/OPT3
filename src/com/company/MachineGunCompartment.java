package com.company;

import java.util.ArrayList;

public class MachineGunCompartment extends Compartment {
    private ArrayList<MachineGun> machineGuns;

    public MachineGunCompartment() {
        super(100);
        this.machineGuns = new ArrayList<>(getMaxCapacity());
        fillToMaxCapacity();
    }

    @Override
    public Integer getCurrentCapacity() {
        return machineGuns.size();
    }

    @Override
    public void fillToMaxCapacity() {
        machineGuns.clear();
        for (int i = 0; i < getMaxCapacity(); i++) {
            machineGuns.add(i, new MachineGun());
        }
    }

    public ArrayList<MachineGun> getMachineGuns() {
        return machineGuns;
    }

    public void setMachineGuns(ArrayList<MachineGun> machineGuns) {
        this.machineGuns = machineGuns;
    }
}
