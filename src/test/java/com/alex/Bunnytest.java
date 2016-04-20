package com.alex;


import com.alex.pets.Bunny;
import org.junit.Assert;
import org.junit.Test;

public class Bunnytest {

    @Test
    public void testBunnyHaveCorrectName(){
        Bunny bunny = new Bunny("Bugz", "Shinshilla", "Gray");
        Assert.assertEquals("Check bunny has correct name", "Bugz", bunny.getName());
    }

    @Test
    public void testBunnyHaveCorrectBreed(){
        Bunny bunny = new Bunny("Bugz", "Shinshilla", "Gray");
        Assert.assertEquals("Shinshilla", bunny.getBreed());
    }

    @Test
    public void testBunnyHaveCorrectColor(){
        Bunny bunny = new Bunny("Bugz", "Shinshilla", "Gray");
        Assert.assertEquals("Gray", bunny.getColor());
    }

}
