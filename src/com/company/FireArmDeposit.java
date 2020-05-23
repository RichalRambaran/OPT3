package com.company;

public class FireArmDeposit {
    private static FireArmDeposit fireArmDeposit;
    private MachineGunCompartment machineGunCompartment;
    private RifleCompartment rifleCompartment;

    private FireArmDeposit() {
        this.machineGunCompartment = new MachineGunCompartment();
        this.rifleCompartment = new RifleCompartment();
    }

    private static class FireArmDepositHolder {
        private static final FireArmDeposit fireArmDeposit = new FireArmDeposit();
    }

    public static FireArmDeposit getFireArmDeposit() {
        return FireArmDeposit.FireArmDepositHolder.fireArmDeposit;
    }

    public MachineGunCompartment getMachineGunCompartment() {
        return machineGunCompartment;
    }

    public void setMachineGunCompartment(MachineGunCompartment machineGunCompartment) {
        this.machineGunCompartment = machineGunCompartment;
    }

    public RifleCompartment getRifleCompartment() {
        return rifleCompartment;
    }

    public void setRifleCompartment(RifleCompartment rifleCompartment) {
        this.rifleCompartment = rifleCompartment;
    }
}
