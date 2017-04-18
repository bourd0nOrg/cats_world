package com.alex.eat;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Студент on 25.05.2016.
 */
public class MeatBasketArrayTest {
    @Test
    public void testAddMeatToOneElementBasket() {
        MeatBasketArray basketArray = new MeatBasketArray(1);
        Meat meat = new Meat(10, "red");
        basketArray.addMeat(meat);
        Meat[] meats = basketArray.getAllMeats();
        Assert.assertEquals("Size should be 1", 1, meats.length);
        Assert.assertEquals("Added meat is really that we add", meat, meats[0]);
    }

    @Test
    public void testGetMeatFromOneElementBasket() {
        MeatBasketArray basketArray = new MeatBasketArray(1);
        Meat meat = new Meat(10, "red");
        basketArray.addMeat(meat);
        Meat meatFromBasket = basketArray.getMeat();
        Assert.assertEquals(0, basketArray.getCurrentSize());
        Assert.assertEquals(meat, meatFromBasket);
    }

    @Test
    public void testAddMeatToZeroElementBasket() {
        MeatBasketArray basketArray = new MeatBasketArray(0);
       Meat meat = new Meat(10, "red");
        basketArray.addMeat(meat);
        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetAppleFromZeroElementBasket() {
        MeatBasketArray basketArray = new MeatBasketArray(0);
        Meat meatFromBasket = basketArray.getMeat();
    }

    @Test
    public void testAddMeat() {
        MeatBasketArray basketArray = new MeatBasketArray(3);
        basketArray.addMeat(new Meat(1, "brown"));
        basketArray.addMeat(new Meat(2, "red"));
        Assert.assertEquals(2, basketArray.getCurrentSize());
    }

    @Test
    public void testAddMeatToFullBasket() {
        MeatBasketArray basketArray = new MeatBasketArray(3);

        Meat redMeat = new Meat(1, "red");
       Meat brownMeat = new Meat(2, "brown");

        basketArray.addMeat(redMeat);
        basketArray.addMeat(brownMeat);


        Assert.assertEquals(3, basketArray.getCurrentSize());
        Meat[] meats = basketArray.getAllMeats();
        Assert.assertEquals(brownMeat, meats[0]);
        Assert.assertEquals(redMeat, meats[1]);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetMeatFromEmptyBasket() {
        MeatBasketArray basketArray = new MeatBasketArray(3);
        basketArray.getMeat();
    }

    @Test
    public void testGetMeats() {
        MeatBasketArray basketArray = new MeatBasketArray(3);

        Meat brownMeat = new Meat(1, "brown");
        Meat redMeat = new Meat(2, "red");

        basketArray.addMeat(brownMeat);
        basketArray.addMeat(redMeat);


        Assert.assertEquals(3, basketArray.getCurrentSize());

        Assert.assertEquals(brownMeat, basketArray.getMeat());
        Assert.assertEquals(redMeat, basketArray.getMeat());

        Assert.assertEquals(0, basketArray.getCurrentSize());

    }
    @Test
    public void tetsWeightOfBasket(){
        MeatBasketArray basketArray = new MeatBasketArray(4);
        Meat redmeat = new Meat(1, "red");
        Meat brownmeat = new Meat(2, "brown");
        Meat whitemeat = new Meat(3, "white");
        basketArray.addMeat(brownmeat);
        basketArray.addMeat(redmeat);
        basketArray.addMeat(whitemeat);
        Assert.assertEquals(6,basketArray.getWeight());
    }

}