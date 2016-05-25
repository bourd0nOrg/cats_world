package com.alex;

import com.alex.eat.Apple;
import com.alex.eat.AppleBasketArray;
import org.junit.Assert;
import org.junit.Test;

public class AppleBasketArrayTest {

    @Test
    public void testAddAppleToOneElementBasket() {
        AppleBasketArray basketArray = new AppleBasketArray(1);
        Apple apple = new Apple(10, "green");
        basketArray.addApple(apple);
        Apple[] apples = basketArray.getAllApples();
        Assert.assertEquals("Size should be 1", 1, apples.length);
        Assert.assertEquals("Added apple is really that we add", apple, apples[0]);
    }

    @Test
    public void testGetAppleFromOneElementBasket() {
        AppleBasketArray basketArray = new AppleBasketArray(1);
        Apple apple = new Apple(10, "green");
        basketArray.addApple(apple);
        Apple appleFromBasket = basketArray.getApple();
        Assert.assertEquals(0, basketArray.getCurrentSize());
        Assert.assertEquals(apple, appleFromBasket);
    }

    @Test
    public void testAddAppleToZeroElementBasket() {
        AppleBasketArray basketArray = new AppleBasketArray(0);
        Apple apple = new Apple(10, "green");
        basketArray.addApple(apple);
        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetAppleFromZeroElementBasket() {
        AppleBasketArray basketArray = new AppleBasketArray(0);
        Apple appleFromBasket = basketArray.getApple();
    }

    @Test
    public void testAddApple() {
        AppleBasketArray basketArray = new AppleBasketArray(3);
        basketArray.addApple(new Apple(1, "green"));
        basketArray.addApple(new Apple(2, "red"));
        Assert.assertEquals(2, basketArray.getCurrentSize());
    }

    @Test
    public void testAddAppleToFullBasket() {
        AppleBasketArray basketArray = new AppleBasketArray(3);

        Apple greenApple = new Apple(1, "green");
        Apple redApple = new Apple(2, "red");
        Apple yellowApple = new Apple(3, "yellow");
        Apple blueApple = new Apple(4, "blue");

        basketArray.addApple(greenApple);
        basketArray.addApple(redApple);
        basketArray.addApple(yellowApple);
        basketArray.addApple(blueApple);

        Assert.assertEquals(3, basketArray.getCurrentSize());
        Apple[] apples = basketArray.getAllApples();
        Assert.assertEquals(greenApple, apples[0]);
        Assert.assertEquals(redApple, apples[1]);
        Assert.assertEquals(yellowApple, apples[2]);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetAppleFromEmptyBasket() {
        AppleBasketArray basketArray = new AppleBasketArray(3);
        basketArray.getApple();
    }

    @Test
    public void testGetApples() {
        AppleBasketArray basketArray = new AppleBasketArray(3);

        Apple greenApple = new Apple(1, "green");
        Apple redApple = new Apple(2, "red");
        Apple yellowApple = new Apple(3, "yellow");
        Apple blueApple = new Apple(4, "blue");

        basketArray.addApple(greenApple);
        basketArray.addApple(redApple);
        basketArray.addApple(yellowApple);
        basketArray.addApple(blueApple);

        Assert.assertEquals(3, basketArray.getCurrentSize());

        Assert.assertEquals(yellowApple, basketArray.getApple());
        Assert.assertEquals(redApple, basketArray.getApple());
        Assert.assertEquals(greenApple, basketArray.getApple());

        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test
    public void testWeightOfBasket() {
        AppleBasketArray basketArray = new AppleBasketArray(4);

        Apple greenApple = new Apple(1, "green");
        Apple redApple = new Apple(2, "red");
        Apple yellowApple = new Apple(3, "yellow");

        basketArray.addApple(greenApple);
        basketArray.addApple(redApple);
        basketArray.addApple(yellowApple);

        Assert.assertEquals(6, basketArray.getWeight());
    }
}
