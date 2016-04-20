package com.alex;

import com.alex.pets.Wolf;
import org.junit.Assert;
import org.junit.Test;


public class WolfTest {
    @Test
    public void testWolfHaveCorrectName() {
        Wolf wolf = new Wolf("Sif", "Demon");
        Assert.assertEquals("Sif", wolf.getName());
    }

    @Test
    public void theWolfHaveCorrectBreed() {
        Wolf wolf = new Wolf("Sif", "Demon");
        Assert.assertEquals("Demon", wolf.getBreed());
    }

}
