package com.alex;

import com.alex.Eating.Lapa;
import com.alex.pets.Bear;
import org.junit.Assert;
import org.junit.Test;


public class BearTest {

    public Object object;

    @Test
    public void testBearCanSosoatLapy() {
        Bear bear = new Bear("Kopatych", "Grizli", "brown");
        Lapa lapa = (Lapa) object;
        Assert.assertTrue("Check bear can sosat lapy", "Kopatych", bear.mochit());
    }


}