package com.alex;

import com.alex.pets.Cat;
import com.alex.pets.Jiraf;
import com.alex.pets.Shark;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void testCatHaveCorrectName() {
        Cat cat = new Cat("barsik", "Pers");
        Assert.assertEquals("Check cat have correct name", "barsik", cat.getName());
    }

    @Test
    public void testCatHaveCorrectBreed() {
        Cat cat = new Cat("barsik", "Pers");
        Assert.assertEquals("Pers", cat.getBreed());
    }

}
