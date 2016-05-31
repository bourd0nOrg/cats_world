package com.alex;

import com.alex.eat.BasketEggsArray;
import com.alex.eat.Eggs;
import org.junit.Assert;
import org.junit.Test;

public class BasketEggsArrayTest {
    @Test
    public void testAddEggsToOneElementBasket() {
        BasketEggsArray basketArray = new BasketEggsArray(1);
        Eggs eggs = new Eggs(10, "white", "of chickens");
        basketArray.addEggs(eggs);
        Eggs[] eggses = basketArray.getEggses();
        Assert.assertEquals("Size should be 1", 1, eggses.length);
        Assert.assertEquals("Added eggs is really that we add", eggs, eggses[0]);
    }

    @Test
    public void testGetEggsFromOneElementBasket() {
        BasketEggsArray basketArray = new BasketEggsArray(1);
        Eggs eggs = new Eggs(10, "white", "of chickens");
        basketArray.addEggs(eggs);
        Eggs eggsFromBasket = basketArray.getEggs();
        Assert.assertEquals(0, basketArray.getCurrentSize());
        Assert.assertEquals(eggs, eggsFromBasket);
    }

    @Test
    public void testGetEggsToZeroElementBasket() {
        BasketEggsArray basketArray = new BasketEggsArray(0);
        Eggs eggs = new Eggs(10, "white", "of chickens");
        basketArray.addEggs(eggs);
        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetEggsFromZeroElementBasket() {
        BasketEggsArray basketArray = new BasketEggsArray(0);
        Eggs eggsFromBasket = basketArray.getEggs();
    }

    @Test
    public void testAddEggs() {
        BasketEggsArray basketArray = new BasketEggsArray(3);
        basketArray.addEggs(new Eggs(1, "white", "of chickens"));
        basketArray.addEggs(new Eggs(2, "brown", "of chickens"));
        Assert.assertEquals(2, basketArray.getCurrentSize());
    }

    @Test
    public void testAddEggsToFullBasket() {
        BasketEggsArray basketArray = new BasketEggsArray(3);

        Eggs whiteEggs = new Eggs(1, "white", "of chickens");
        Eggs brownEggs = new Eggs(2, "brown", "of chickens");
        Eggs yellowEggs = new Eggs(3, "yellow", "of chickens");
        Eggs redEggs = new Eggs(4, "red", "of chickens");

        basketArray.addEggs(whiteEggs);
        basketArray.addEggs(brownEggs);
        basketArray.addEggs(yellowEggs);
        basketArray.addEggs(redEggs);

        Assert.assertEquals(3, basketArray.getCurrentSize());
        Eggs[] eggses = basketArray.getEggses();
        Assert.assertEquals(whiteEggs, eggses[0]);
        Assert.assertEquals(brownEggs, eggses[1]);
        Assert.assertEquals(yellowEggs, eggses[2]);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetEggsFromEmptyBasket() {
        BasketEggsArray basketArray = new BasketEggsArray(3);
        basketArray.getEggs();
    }

    @Test
    public void testGetCurrentEggs() {
        BasketEggsArray basketArray = new BasketEggsArray(3);

        Eggs whiteEggs = new Eggs(1, "white", "of chickens");
        Eggs brownEggs = new Eggs(2, "brown", "of chickens");
        Eggs yellowEggs = new Eggs(3, "yellow", "of chickens");
        Eggs redEggs = new Eggs(4, "red", "of chickens");

        basketArray.addEggs(whiteEggs);
        basketArray.addEggs(brownEggs);
        basketArray.addEggs(yellowEggs);
        basketArray.addEggs(redEggs);

        Assert.assertEquals(3, basketArray.getCurrentSize());
        Assert.assertEquals(yellowEggs, basketArray.getEggs());
        Assert.assertEquals(brownEggs, basketArray.getEggs());
        Assert.assertEquals(whiteEggs, basketArray.getEggs());
        Assert.assertEquals(0, basketArray.getCurrentSize());

    }
    @Test
    public void testWeighOfBasket() {
        BasketEggsArray basketArray = new BasketEggsArray(4);

        Eggs whiteEggs = new Eggs(1, "white", "of chickens");
        Eggs brownEggs = new Eggs(2, "brown", "of chickens");
        Eggs yellowEggs = new Eggs(3, "yellow", "of chickens");

        basketArray.addEggs(whiteEggs);
        basketArray.addEggs(brownEggs);
        basketArray.addEggs(yellowEggs);

        Assert.assertEquals(6, basketArray.getWeight());
    }
}
