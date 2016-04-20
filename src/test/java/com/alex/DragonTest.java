package com.alex;

import com.alex.exceptions.PetIsDeadException;
import com.alex.pets.Dragon;
import com.alex.pets.Sheep;
import org.junit.Assert;
import org.junit.Test;

public class DragonTest {
    @Test
    public void testDragonHaveCorrectName() {
        Dragon dragon = new Dragon("Alduin", "Ice");
        Assert.assertEquals ("Check Dragon have correct name", "Alduin",dragon.getName());
    }
    @Test
    public void testDragonHaveCorrectBreath() {
        Dragon dragon = new Dragon("Alduin", "Ice");
        Assert.assertEquals ("Ice",dragon.getBreath());
    }

    @Test
    public void testDragonEat() {
        Sheep sheep = new Sheep("Sheep");
        Dragon dragon = new Dragon("Alduin", "Ice");
        dragon.eat(sheep);
        Assert.assertFalse ("Check that Dragon eat sheep", sheep.isAlive());
    }

    @Test(expected = PetIsDeadException.class)
    public void PetIsDeadException() {
        Dragon dragon = new Dragon("Alduin", "Ice");
        dragon.kill();
        dragon.fly();
    }
}


