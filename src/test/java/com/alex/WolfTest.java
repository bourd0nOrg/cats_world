package com.alex;

import com.alex.pets.Wolf;
import org.junit.Assert;


public class WolfTest {

    public void testWolfHaveCorrectName() {
        Wolf wolf = new Wolf("Sif", "Demon");
        Assert.assertEquals("Sif", wolf.getName());
    }
    public void theCatHaveCorrectBreed() {
        Wolf wolf = new Wolf("Sif","Demon");
        Assert.assertEquals("Demon", wolf.getBreed());
    }

}
