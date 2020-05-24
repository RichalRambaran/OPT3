package com.company;

public class Soldier extends Troop {
    private FireArm fireArm;

    public Soldier(String name) {
        super(name);
    }

    public void grabMachineGun() {
        int index = 0;
        if (FireArmDeposit.getFireArmDeposit().getMachineGunCompartment().getMachineGuns().get(index) != null) {
            obtainMachineGun(index);
            System.out.println(getName() + " has grabbed a machine gun");
        }
        else {
            System.out.println(getName() + " couldn't grab a machine gun because the machine gun compartment is empty.");
        }
    }

    private void obtainMachineGun(int index) {
        fireArm = FireArmDeposit.getFireArmDeposit().getMachineGunCompartment().getMachineGuns().get(index);
        FireArmDeposit.getFireArmDeposit().getMachineGunCompartment().getMachineGuns().remove(index);
    }

    public void grabRifle() {
        int index = 0;
        if (FireArmDeposit.getFireArmDeposit().getRifleCompartment().getRifles().get(index) != null) {
            obtainRifle(index);
            System.out.println(getName() + " has grabbed a rifle");
        }
        else {
            System.out.println(getName() + " couldn't grab a rifle because the rifle compartment is empty.");
        }
    }

    private void obtainRifle(int index) {
        fireArm = FireArmDeposit.getFireArmDeposit().getRifleCompartment().getRifles().get(index);
        FireArmDeposit.getFireArmDeposit().getRifleCompartment().getRifles().remove(index);
    }

    public void shootBurst(Target target) {
        String startingText = getName() + " couldn't shoot the target because";
        if (isInRange(target)) {
            if (isAlive(target)) {
                if (hasEnoughAmmunition()) {
                    carryOutShot(target);
                    System.out.println(getName() + " successfully shot the target");
                }
                else {
                    System.out.println(startingText + " there isn't enough ammunition in the magazine left.");
                }
            }
            else {
                System.out.println(startingText + " the target because the target is already dead.");
            }
        }
        else {
            System.out.println(startingText + " the target is out of range.");
        }
    }

    private Boolean isInRange(Target target) {
        boolean isInRange;
        isInRange = target.getDistance() <= fireArm.getMaxRange();
        return isInRange;
    }

    private Boolean isAlive(Target target) {
        boolean isAlive;
        isAlive = target.getAlive();
        return isAlive;
    }

    private Boolean hasEnoughAmmunition() {
        boolean hasEnoughAmmunition;
        hasEnoughAmmunition = fireArm.getMagazine().getCurrentAmmunition() >= fireArm.getBulletsPerBurst();
        return hasEnoughAmmunition;
    }

    private void carryOutShot(Target target) { // extracting methods to prevent large method
        target.setBulletHits(target.getBulletHits() + fireArm.getBulletsPerBurst());
        fireArm.getMagazine().setCurrentAmmunition(fireArm.getMagazine().getCurrentAmmunition() - fireArm.getBulletsPerBurst());
    }

    public void reload() {
        fireArm.getMagazine().setCurrentAmmunition(fireArm.getMagazine().getMaxAmmunition());
        System.out.println(getName() + " has reload his/her firearm");
    }
}
