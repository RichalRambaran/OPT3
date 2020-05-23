package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RifleTest {
    @Test
    public void initialValues() {
        Rifle rifle = new Rifle();
        assertEquals(500, rifle.getMaxRange());
        assertEquals(5, rifle.getBulletsPerBurst());
        assertEquals(90, rifle.getMagazine().getMaxAmmunition());
        assertEquals(90, rifle.getMagazine().getCurrentAmmunition());
        assertEquals("This weapon is recommended for warfare.", rifle.getRecommendation().recommendation());
    }
}