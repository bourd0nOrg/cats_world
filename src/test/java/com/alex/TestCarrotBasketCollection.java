package com.alex;

import com.alex.eat.Carrot;
import com.alex.eat.CarrotBasketCollection;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestCarrotBasketCollection {

    @Test
    public void testAddCarrotToOneElementBasket() {
        CarrotBasketCollection basketArray = new CarrotBasketCollection(1);
        Carrot carrot = new Carrot(7, "orange");
        basketArray.addCarrot(carrot);
        Set<Carrot> carrots = basketArray.getAllCarrots();
        Assert.assertEquals("Size should be 1", 1, carrots.size());
        Assert.assertEquals("Real carrot", carrot, carrots.iterator().next());
    }

    @Test
    public void testGetCarrotFromOneElementBasket() {
        CarrotBasketCollection basketArray = new CarrotBasketCollection(1);
        Carrot carrot = new Carrot(7, "orange");
        basketArray.addCarrot(carrot);
        Carrot carrotFromBasket = basketArray.getCarrot();
        Assert.assertEquals(0, basketArray.getCurrentSize());
        Assert.assertEquals("Real carrot", carrot, carrotFromBasket);
    }

    @Test
    public void testAddCarrotToZeroElementBasket() {
        CarrotBasketCollection basketArray = new CarrotBasketCollection(0);
        Carrot carrot = new Carrot(7, "orange");
        basketArray.addCarrot(carrot);
        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCarrotToZeroElementBasket() {
        CarrotBasketCollection basketArray = new CarrotBasketCollection(0);
        Carrot carrotFromBasket = basketArray.getCarrot();
    }

    @Test
    public void testAddCarrot() {
        CarrotBasketCollection basketArray = new CarrotBasketCollection(3);
        basketArray.addCarrot(new Carrot(1, "orange"));
        basketArray.addCarrot(new Carrot(2, "yellow"));
        Assert.assertEquals(2, basketArray.getCurrentSize());
    }

    @Test
    public void testAddCarrotToFullBasket() {
        CarrotBasketCollection basketArray = new CarrotBasketCollection(3);

        Carrot orangeCarrot = new Carrot(1, "orange");
        Carrot yellowCarrot = new Carrot(2, "yellow");
        Carrot whiteCarrot = new Carrot(3, "white");
        Carrot blackCarrot = new Carrot(4, "black");

        basketArray.addCarrot(orangeCarrot);
        basketArray.addCarrot(yellowCarrot);
        basketArray.addCarrot(whiteCarrot);
        basketArray.addCarrot(blackCarrot);

        Assert.assertEquals(3, basketArray.getCurrentSize());
        Set<Carrot> carrots = basketArray.getAllCarrots();

        Assert.assertTrue("", carrots.contains(orangeCarrot));
        Assert.assertTrue("", carrots.contains(yellowCarrot));
        Assert.assertTrue("", carrots.contains(whiteCarrot));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCarrotFromZeroElementBasket() {
        CarrotBasketCollection basketArray = new CarrotBasketCollection(3);
        Carrot carrotFromBasket = basketArray.getCarrot();
    }


    @Test
    public void testGetCurrentCarrot() {
        CarrotBasketCollection basketArray = new CarrotBasketCollection(3);

        Carrot orangeCarrot = new Carrot(1, "orange");
        Carrot yellowCarrot = new Carrot(2, "yellow");
        Carrot whiteCarrot = new Carrot(3, "white");
        Carrot blackCarrot = new Carrot(4, "black");

        basketArray.addCarrot(orangeCarrot);
        basketArray.addCarrot(yellowCarrot);
        basketArray.addCarrot(whiteCarrot);
        basketArray.addCarrot(blackCarrot);

        Assert.assertEquals(3, basketArray.getCurrentSize());

        List<Carrot> testCarrots = new ArrayList<>();
        testCarrots.add(whiteCarrot);
        testCarrots.add(yellowCarrot);
        testCarrots.add(orangeCarrot);

        Carrot currentTestCarrot = basketArray.getCarrot();
        Assertions.assertThat(currentTestCarrot).isIn(testCarrots);
        testCarrots.remove(currentTestCarrot);

        currentTestCarrot = basketArray.getCarrot();
        Assertions.assertThat(currentTestCarrot).isIn(testCarrots);
        testCarrots.remove(currentTestCarrot);

        currentTestCarrot = basketArray.getCarrot();
        Assertions.assertThat(currentTestCarrot).isIn(testCarrots);
        testCarrots.remove(currentTestCarrot);

        Assert.assertEquals(0, basketArray.getCurrentSize());

    }

    @Test
    public void testWeightOfBasket() {
        CarrotBasketCollection basketArray = new CarrotBasketCollection(4);

        Carrot orangeCarrot = new Carrot(1, "orange");
        Carrot yellowCarrot = new Carrot(2, "yellow");
        Carrot whiteCarrot = new Carrot(3, "white");

        basketArray.addCarrot(orangeCarrot);
        basketArray.addCarrot(yellowCarrot);
        basketArray.addCarrot(whiteCarrot);

        Assert.assertEquals(6, basketArray.getWeight());

    }
}
