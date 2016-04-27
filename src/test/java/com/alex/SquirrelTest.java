package com.alex;


import com.alex.pets.Squirrel;
import org.junit.Assert;
import org.junit.Test;

public class SquirrelTest {
    @Test
    public void testSquirrelHaveCorrectName() {
        Squirrel squirrel = new Squirrel( "Puny", "letyga" );
        Assert.assertEquals("Puny", squirrel.getName());
    }
    @Test
    public void testSquirrelHaveCorrectBreed() {
        Squirrel squirrel = new Squirrel( "Puny", "letyga" );
        Assert.assertEquals("letyga", squirrel.getBreed());
    }
}