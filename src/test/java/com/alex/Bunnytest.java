package com.alex;


import com.alex.exceptions.PetIsDeadException;
import com.alex.pets.Bunny;
import com.alex.plants.Clover;
import org.junit.Assert;
import org.junit.Test;

public class Bunnytest {

    @Test
    public void testBunnyHaveCorrectName() {
        Bunny bunny = new Bunny("Bugz", "Shinshilla", "Gray");
        Assert.assertEquals("Check bunny has correct name", "Bugz", bunny.getName());
    }

    @Test
    public void testBunnyHaveCorrectBreed() {
        Bunny bunny = new Bunny("Bugz", "Shinshilla", "Gray");
        Assert.assertEquals("Shinshilla", bunny.getBreed());
    }

    @Test
    public void testBunnyHaveCorrectColor() {
        Bunny bunny = new Bunny("Bugz", "Shinshilla", "Gray");
        Assert.assertEquals("Gray", bunny.getColor());
    }

    @Test
    public void testBunnyEatClover() {
        Clover clover = new Clover("Clover");
        Bunny bunny = new Bunny("Bugz", "Shinshilla", "Gray");
        bunny.eat(clover);
        Assert.assertFalse("Check that Clover poisoning Bunny", bunny.isAlive());
    }

    @Test(expected = PetIsDeadException.class)
    public void testBunnyIsThrowExpected() {
        Bunny bunny = new Bunny("Bugz", "Shinshilla", "Gray");
        bunny.kill();
        bunny.eat(new Clover("Grass"));
    }
}


