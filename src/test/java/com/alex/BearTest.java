package com.alex;

import com.alex.eat.Lapa;
import com.alex.exceptions.PetIsDeadException;
import com.alex.pets.Bear;
import com.alex.pets.Dragon;
import org.junit.Assert;
import org.junit.Test;
import com.alex.eat.Wet;


public class BearTest {

    public Object object;

    @Test
    public void testBearCanSosoatLapy() {
        Bear bear = new Bear("Kopatych", "Grizli", "brown");
        Lapa lapa = new Lapa("lapa", "43");
        bear.grblzt(lapa);
        Assert.assertTrue("Can bear sosat lapy", lapa.isWet());
    }

    @Test
    public void testCanBearSushitLapy() {
        Bear bear = new Bear("Kopatych", "Grizli", "brown");
        Lapa lapa = new Lapa("lapa", "43");
        if (bear.isAlive()) {
            lapa.dry();
        } else {
            lapa.namochit();
        }
        Assert.assertFalse("Can bear sushit lapy", lapa.isWet());
    }

    @Test(expected = PetIsDeadException.class)
    public void testBearsDeath() {
        Bear bear = new Bear("Misha", "beliy", "white");
        Dragon dragon = new Dragon("Hvostoroga", "Fire");
        dragon.kill(bear);
        bear.grblzt(new Lapa("lapa", "43"));
    }
}
