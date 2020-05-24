package com.company;

import java.util.ArrayList;

public class RifleCompartment extends Compartment {
    private ArrayList<Rifle> rifles;

    public RifleCompartment() {
        super(100);
        this.rifles = new ArrayList<>(getMaxCapacity());
        fillToMaxCapacity();
    }

    @Override
    public Integer getCurrentCapacity() {
        return rifles.size();
    }

    @Override
    public void fillToMaxCapacity() {
        rifles.clear();
        for (int i = 0; i < getMaxCapacity(); i++) {
            rifles.add(i, new Rifle());
        }
    }

    public ArrayList<Rifle> getRifles() {
        return rifles;
    }

    public void setRifles(ArrayList<Rifle> rifles) {
        this.rifles = rifles;
    }
}
