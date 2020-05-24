package com.company;

public abstract class Troop {
    private String name;

    public Troop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
