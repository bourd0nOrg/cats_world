package com.alex;

import com.alex.eat.BasketEggsArray;
import com.alex.eat.Eggs;
import com.alex.eat.EggsBasketCollection;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BasketEggsCollectionTest {
    @Test
    public void testAddEggsToOneElementBasket() {
        EggsBasketCollection basketArray = new EggsBasketCollection(1);
        Eggs eggs = new Eggs(10, "white", "of chickens");
        basketArray.addEggs(eggs);
        Set<Eggs> eggses = basketArray.getAllEggs();

        Assert.assertEquals("Size should be 1", 1, eggses.size());
        Assert.assertEquals("Added eggs is really that we add", eggs, eggses.iterator().next());
    }

    @Test
    public void testGetEggsFromOneElementBasket() {
        EggsBasketCollection basketArray = new EggsBasketCollection(1);
        Eggs eggs = new Eggs(10, "white", "of chickens");
        basketArray.addEggs(eggs);
        Eggs eggsFromBasket = basketArray.getEggs();
        Assert.assertEquals(0, basketArray.getCurrentSize());
        Assert.assertEquals(eggs, eggsFromBasket);
    }

    @Test
    public void testGetEggsToZeroElementBasket() {
        EggsBasketCollection basketArray = new EggsBasketCollection(0);
        Eggs eggs = new Eggs(10, "white", "of chickens");
        basketArray.addEggs(eggs);
        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetEggsFromZeroElementBasket() {
        EggsBasketCollection basketArray = new EggsBasketCollection(0);
        Eggs eggsFromBasket = basketArray.getEggs();
    }

    @Test
    public void testAddEggs() {
        EggsBasketCollection basketArray = new EggsBasketCollection(3);
        basketArray.addEggs(new Eggs(1, "white", "of chickens"));
        basketArray.addEggs(new Eggs(2, "brown", "of chickens"));
        Assert.assertEquals(2, basketArray.getCurrentSize());
    }

    @Test
    public void testAddEggsToFullBasket() {
        EggsBasketCollection basketArray = new EggsBasketCollection(3);

        Eggs whiteEggs = new Eggs(1, "white", "of chickens");
        Eggs brownEggs = new Eggs(2, "brown", "of chickens");
        Eggs yellowEggs = new Eggs(3, "yellow", "of chickens");
        Eggs redEggs = new Eggs(4, "red", "of chickens");

        basketArray.addEggs(whiteEggs);
        basketArray.addEggs(brownEggs);
        basketArray.addEggs(yellowEggs);
        basketArray.addEggs(redEggs);

        Assert.assertEquals(3, basketArray.getCurrentSize());
        Set<Eggs> eggses = basketArray.getAllEggs();
        Assert.assertTrue("Basket should containt white eggs", eggses.contains(whiteEggs));
        Assert.assertTrue("Basket should containt brown eggs", eggses.contains(brownEggs));
        Assert.assertTrue("Basket should containt yellow eggs", eggses.contains(yellowEggs));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetEggsFromEmptyBasket() {
        EggsBasketCollection basketArray = new EggsBasketCollection(3);
        basketArray.getEggs();
    }

    @Test
    public void testGetCurrentEggs() {
        EggsBasketCollection basketArray = new EggsBasketCollection(3);

        Eggs whiteEggs = new Eggs(1, "white", "of chickens");
        Eggs brownEggs = new Eggs(2, "brown", "of chickens");
        Eggs yellowEggs = new Eggs(3, "yellow", "of chickens");
        Eggs redEggs = new Eggs(4, "red", "of chickens");

        basketArray.addEggs(whiteEggs);
        basketArray.addEggs(brownEggs);
        basketArray.addEggs(yellowEggs);
        basketArray.addEggs(redEggs);

        Assert.assertEquals(3, basketArray.getCurrentSize());

        List<Eggs> testEggses = new ArrayList<>();
        testEggses.add(whiteEggs);
        testEggses.add(brownEggs);
        testEggses.add(yellowEggs);

        Eggs currentTesrEggs = basketArray.getEggs();
        Assertions.assertThat(currentTesrEggs).isIn(testEggses);
        testEggses.remove(currentTesrEggs);

        currentTesrEggs = basketArray.getEggs();
        Assertions.assertThat(currentTesrEggs).isIn(testEggses);
        testEggses.remove(currentTesrEggs);

        currentTesrEggs = basketArray.getEggs();
        Assertions.assertThat(currentTesrEggs).isIn(testEggses);
        testEggses.remove(currentTesrEggs);

        Assert.assertEquals(0, basketArray.getCurrentSize());

    }

    @Test
    public void testWeighOfBasket() {
        EggsBasketCollection basketArray = new EggsBasketCollection(4);

        Eggs whiteEggs = new Eggs(1, "white", "of chickens");
        Eggs brownEggs = new Eggs(2, "brown", "of chickens");
        Eggs yellowEggs = new Eggs(3, "yellow", "of chickens");

        basketArray.addEggs(whiteEggs);
        basketArray.addEggs(brownEggs);
        basketArray.addEggs(yellowEggs);

        Assert.assertEquals(6, basketArray.getWeight());
    }
}
