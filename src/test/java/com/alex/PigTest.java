package com.alex;

import com.alex.pets.Pig;
import org.junit.Assert;
import org.junit.Test;

public class PigTest {
    @Test
    public void testPigHaveCorrectName() {
        Pig pig = new Pig("hryusha", "kaban");
        Assert.assertEquals("Check pig has correct name","hryusha", pig.getName());
    }
    @Test
    public void testPigHaveCorrectBreed() {
        Pig pig = new Pig("hryusha", "kaban");
        Assert.assertEquals("kaban", pig.getBreed());
    }
}
