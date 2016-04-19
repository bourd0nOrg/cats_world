package com.alex;

import com.alex.pets.Cow;
import com.alex.pets.Pantera;
import org.junit.Assert;
import org.junit.Test;

public class CowKilledTest {
    @Test
    public void testCowKilled(){
        Cow cow = new Cow("Aurora", "Alpen");
        Pantera pantera = new Pantera("Terapan", "Black", "Black");
        cow.isAlive();
        pantera.eat(cow);
        Assert.assertEquals("Корова жива", cow.isAlive(), false);
    }
}
