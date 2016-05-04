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
    }
}
