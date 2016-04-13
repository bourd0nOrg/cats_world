package com.alex;


import com.alex.pets.Raccoon;
import org.junit.Assert;
import org.junit.Test;


public class RaccoonTest {
    @Test
    public void testRaccoonHaveCorrectName() {
        Raccoon raccon = new Raccoon("Jora", "Poloskun");
        Assert.assertEquals("Check raccoon have correct name", "Jora", raccon.getName());
    }

    @Test
    public void testRaccoonHaveCorrectBreed() {
        Raccoon raccon = new Raccoon("Jora", "Poloskun");
        Assert.assertEquals("Poloskun", raccon.getBreed());
    }
}
