package com.alex;

import com.alex.eat.Apple;
import com.alex.eat.AppleBasketCollection;
import com.alex.eat.Carrot;
import com.alex.eat.SuperBasket;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AppleBasketCollectionTest {

    @Test
    public void testAddAppleToOneElementBasket() {
        AppleBasketCollection basketArray = new AppleBasketCollection(1);
        Apple apple = new Apple(10, "green");
        basketArray.addApple(apple);
        Set<Apple> apples = basketArray.getAllApples();
        Assert.assertEquals("Size should be 1", 1, apples.size());
        Assert.assertEquals("Added apple is really that we add", apple, apples.iterator().next());
    }

    @Test
    public void testGetAppleFromOneElementBasket() {
        AppleBasketCollection basketArray = new AppleBasketCollection(1);
        Apple apple = new Apple(10, "green");
        basketArray.addApple(apple);
        Apple appleFromBasket = basketArray.getApple();
        Assert.assertEquals(0, basketArray.getCurrentSize());
        Assert.assertEquals(apple, appleFromBasket);
    }

    @Test
    public void testAddAppleToZeroElementBasket() {
        AppleBasketCollection basketArray = new AppleBasketCollection(0);
        Apple apple = new Apple(10, "green");
        basketArray.addApple(apple);
        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetAppleFromZeroElementBasket() {
        AppleBasketCollection basketArray = new AppleBasketCollection(0);
        Apple appleFromBasket = basketArray.getApple();
    }

    @Test
    public void testAddApple() {
        AppleBasketCollection basketArray = new AppleBasketCollection(3);
        basketArray.addApple(new Apple(1, "green"));
        basketArray.addApple(new Apple(2, "red"));
        Assert.assertEquals(2, basketArray.getCurrentSize());
    }

    @Test
    public void testAddAppleToFullBasket() {
        AppleBasketCollection basketArray = new AppleBasketCollection(3);

        Apple greenApple = new Apple(1, "green");
        Apple redApple = new Apple(2, "red");
        Apple yellowApple = new Apple(3, "yellow");
        Apple blueApple = new Apple(4, "blue");

        basketArray.addApple(greenApple);
        basketArray.addApple(redApple);
        basketArray.addApple(yellowApple);
        basketArray.addApple(blueApple);

        Assert.assertEquals(3, basketArray.getCurrentSize());
        Set<Apple> apples = basketArray.getAllApples();
        
        Assert.assertTrue("Basket should contain green apple", apples.contains(greenApple));
        Assert.assertTrue(apples.contains(redApple));
        Assert.assertTrue(apples.contains(yellowApple));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetAppleFromEmptyBasket() {
        AppleBasketCollection basketArray = new AppleBasketCollection(3);
        basketArray.getApple();
    }

    @Test
    public void testGetApples() {
        AppleBasketCollection basketArray = new AppleBasketCollection(3);

        Apple greenApple = new Apple(1, "green");
        Apple redApple = new Apple(2, "red");
        Apple yellowApple = new Apple(3, "yellow");
        Apple blueApple = new Apple(4, "blue");

        basketArray.addApple(greenApple);
        basketArray.addApple(redApple);
        basketArray.addApple(yellowApple);
        basketArray.addApple(blueApple);

        Assert.assertEquals(3, basketArray.getCurrentSize());

        List<Apple> testApples = new ArrayList<>();
        testApples.add(yellowApple);
        testApples.add(redApple);
        testApples.add(greenApple);

        Apple currentTestApple = basketArray.getApple();
        Assertions.assertThat(currentTestApple).isIn(testApples);
        testApples.remove(currentTestApple);

        currentTestApple = basketArray.getApple();
        Assertions.assertThat(currentTestApple).isIn(testApples);
        testApples.remove(currentTestApple);

        currentTestApple = basketArray.getApple();
        Assertions.assertThat(currentTestApple).isIn(testApples);
        testApples.remove(currentTestApple);

        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test
    public void testWeightOfBasket() {
        AppleBasketCollection basketArray = new AppleBasketCollection(4);

        Apple greenApple = new Apple(1, "green");
        Apple redApple = new Apple(2, "red");
        Apple yellowApple = new Apple(3, "yellow");

        basketArray.addApple(greenApple);
        basketArray.addApple(redApple);
        basketArray.addApple(yellowApple);

        Assert.assertEquals(6, basketArray.getWeight());
    }
}
