package com.alex;

import com.alex.pets.Dragon;
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
}
