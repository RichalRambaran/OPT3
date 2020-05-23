package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MachineGunTest {
    @Test
    public void initialValues() {
        MachineGun machineGun = new MachineGun();
        assertEquals(200, machineGun.getMaxRange());
        assertEquals(15, machineGun.getBulletsPerBurst());
        assertEquals(210, machineGun.getMagazine().getMaxAmmunition());
        assertEquals(210, machineGun.getMagazine().getCurrentAmmunition());
        assertEquals("This weapon is not recommended for warfare, but is still allowed.", machineGun.getRecommendation().recommendation());
    }
}