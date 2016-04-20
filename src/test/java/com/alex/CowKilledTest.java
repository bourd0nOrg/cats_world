package com.alex;

import com.alex.exceptions.PetIsDeadException;
import com.alex.pets.Cow;
import com.alex.pets.Pantera;
import com.alex.plants.Grass;
import org.junit.Assert;
import org.junit.Test;

public class CowKilledTest {
    @Test
    public void testCowKilled() {
        Cow cow = new Cow("Aurora", "Alpen");
        Pantera pantera = new Pantera("Terapan", "Black", "Black");
        pantera.eat(cow);
        Assert.assertFalse("Корова жива", cow.isAlive());
    }
}