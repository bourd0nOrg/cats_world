package com.alex;


import com.alex.exceptions.PetIsDeadException;
import com.alex.pets.Squirrel;
import com.alex.plants.Dyplo;
import org.junit.Assert;
import org.junit.Test;

public class SquirrelTest {
    @Test
    public void testSquirrelHaveCorrectName() {
        Squirrel squirrel = new Squirrel("Puny", "letyga");
        Assert.assertEquals("Puny", squirrel.getName());
    }

    @Test
    public void testSquirrelHaveCorrectBreed() {
        Squirrel squirrel = new Squirrel("Puny", "letyga");
        Assert.assertEquals("letyga", squirrel.getBreed());
    }

    @Test
    public void testSquirrelHaveCorrectStore() {
        Dyplo dyplo = new Dyplo("Dyplo");
        Squirrel squirrel = new Squirrel("Puny", "letyga");
        squirrel.store(dyplo);
        Assert.assertFalse("Check that Dyplo store Squirrel", squirrel.isAlive());
    }

    @Test(expected = PetIsDeadException.class)
    public void testSquirrelIsThrowExpected() {
        Squirrel squirrel = new Squirrel("Puny", "letyga");
        squirrel.kill();
        squirrel.store(new Dyplo("Tree"));
    }
}