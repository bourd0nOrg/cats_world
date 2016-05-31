package com.alex;

import com.alex.eat.Carrot;
import com.alex.eat.CarrotBasketArray;
import org.junit.Assert;
import org.junit.Test;

public class TestCarrotBasket {

    @Test
    public void testAddCarrotToOneElementBasket() {
        CarrotBasketArray basketArray = new CarrotBasketArray(1);
        Carrot carrot = new Carrot(7, "orange");
        basketArray.addCarrot(carrot);
        Carrot[] carrots = basketArray.getAllCarrots();
        Assert.assertEquals("Size should be 1", 1, carrots.length);
        Assert.assertEquals("Real carrot", carrot, carrots[0]);
    }

    @Test
    public void testGetCarrotFromOneElementBasket() {
        CarrotBasketArray basketArray = new CarrotBasketArray(1);
        Carrot carrot = new Carrot(7, "orange");
        basketArray.addCarrot(carrot);
        Carrot carrotFromBasket = basketArray.getCarrot();
        Assert.assertEquals(0, basketArray.getCurrentSize());
        Assert.assertEquals("Real carrot", carrot, carrotFromBasket);
    }

    @Test
    public void testAddCarrotToZeroElementBasket() {
        CarrotBasketArray basketArray = new CarrotBasketArray(0);
        Carrot carrot = new Carrot(7, "orange");
        basketArray.addCarrot(carrot);
        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCarrotToZeroElementBasket() {
        CarrotBasketArray basketArray = new CarrotBasketArray(0);
        Carrot carrotFromBasket = basketArray.getCarrot();
    }

    @Test
    public void testAddCarrot() {
        CarrotBasketArray basketArray = new CarrotBasketArray(3);
        basketArray.addCarrot(new Carrot(1, "orange"));
        basketArray.addCarrot(new Carrot(2, "yellow"));
        Assert.assertEquals(2, basketArray.getCurrentSize());
    }

    @Test
    public void testAddCarrotToFullBasket() {
        CarrotBasketArray basketArray = new CarrotBasketArray(3);

        Carrot orangeCarrot = new Carrot(1, "orange");
        Carrot yellowCarrot = new Carrot(2, "yellow");
        Carrot whieCarrot = new Carrot(3, "white");
        Carrot blackCarrot = new Carrot(4, "black");
        basketArray.addCarrot(orangeCarrot);
        basketArray.addCarrot(yellowCarrot);
        basketArray.addCarrot(whieCarrot);
        basketArray.addCarrot(blackCarrot);

        Assert.assertEquals(3, basketArray.getCurrentSize());
        Carrot[] carrots = basketArray.getAllCarrots();
        Assert.assertEquals(orangeCarrot, carrots[0]);
        Assert.assertEquals(yellowCarrot, carrots[1]);
        Assert.assertEquals(whieCarrot, carrots[2]);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCarrotFromZeroElementBasket() {
        CarrotBasketArray basketArray = new CarrotBasketArray(3);
        Carrot carrotFromBasket = basketArray.getCarrot();
    }


    @Test
    public void testGetCurrentCarrot() {
        CarrotBasketArray basketArray = new CarrotBasketArray(3);

        Carrot orangeCarrot = new Carrot(1, "orange");
        Carrot yellowCarrot = new Carrot(2, "yellow");
        Carrot whiteCarrot = new Carrot(3, "white");
        Carrot blackCarrot = new Carrot(4, "black");

        basketArray.addCarrot(orangeCarrot);
        basketArray.addCarrot(yellowCarrot);
        basketArray.addCarrot(whiteCarrot);
        basketArray.addCarrot(blackCarrot);

        Assert.assertEquals(3, basketArray.getCurrentSize());
        Assert.assertEquals(whiteCarrot, basketArray.getCarrot());
        Assert.assertEquals(yellowCarrot, basketArray.getCarrot());
        Assert.assertEquals(orangeCarrot, basketArray.getCarrot());
        Assert.assertEquals(0, basketArray.getCurrentSize());

    }

    @Test
    public void testWeightOfBasket() {
        CarrotBasketArray basketArray = new CarrotBasketArray(4);

        Carrot orangeCarrot = new Carrot(1, "orange");
        Carrot yellowCarrot = new Carrot(2, "yellow");
        Carrot whiteCarrot = new Carrot(3, "white");

        basketArray.addCarrot(orangeCarrot);
        basketArray.addCarrot(yellowCarrot);
        basketArray.addCarrot(whiteCarrot);

        Assert.assertEquals(6, basketArray.getWeight());

    }
}
