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

    public void shootBurst(Target target) {
        String couldNotShoot = getName() + " couldn't shoot the target because";
        if (target.getDistance() <= fireArm.getMaxRange()) {
            if (target.getAlive()) {
                if (fireArm.getMagazine().getCurrentAmmunition() >= fireArm.getBulletsPerBurst()) {
                    addBulletHitsToTarget(target);
                    reduceAmmunition();
                    System.out.println(getName() + " successfully shot the target");
                }
                else {
                    System.out.println(couldNotShoot + " there isn't enough ammunition in the magazine left.");
                }
            }
            else {
                System.out.println(couldNotShoot + " the target because the target is already dead.");
            }
        }
        else {
            System.out.println(couldNotShoot + " the target is out of range.");
        }
    }

    private void addBulletHitsToTarget(Target target) {
        target.setBulletHits(target.getBulletHits() + fireArm.getBulletsPerBurst());
    }

    private void reduceAmmunition() {
        fireArm.getMagazine().setCurrentAmmunition(fireArm.getMagazine().getCurrentAmmunition() - fireArm.getBulletsPerBurst());
    }

    public void reload() {
        fireArm.getMagazine().setCurrentAmmunition(fireArm.getMagazine().getMaxAmmunition());
    }
}
