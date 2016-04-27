package com.alex;

import com.alex.pets.Cow;
import org.junit.Assert;
import org.junit.Test;

public class CowTest {

    @Test
    public void testCowHaveCorrectName() {
        Cow cow = new Cow("aurora", "alpen");
        Assert.assertEquals("Check cow have correct name", "aurora", cow.getName());
    }

    @Test
    public void testCowHaveCorrectBreed() {
        Cow cow = new Cow("aurora", "alpen");
        Assert.assertEquals("alpen", cow.getBreed());
    }


}
