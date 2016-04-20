package com.alex.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Студент on 20.04.2016.
 */
public class FishTest {

    @Test
    public void FishtestGetBreed() throws Exception {
        Fish ocun = new Fish("ocun");
        Assert.assertEquals("ocun", ocun.getBreed());
    }

    @Test
    public void FishtestEat() throws Exception {
        Fish ocun = new Fish("ocun");
        Assert.assertEquals("ocun", ocun.eat());
    }

    @Test
    public void FishtestMetatIkra() throws Exception {
        Fish ocun = new Fish("ocun");
        Assert.assertEquals("ocun", ocun.metatIkra());
    }
}