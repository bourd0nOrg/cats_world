package com.alex;

import com.alex.eat.Tryfel;

import com.alex.eat.TryfelBasketCollection;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TryfelBasketArrayTest {

    @Test
    public void testAddTryfeltoOneElementBasket() {
        TryfelBasketCollection basketArray = new TryfelBasketCollection(1);
        Tryfel tryfel = new Tryfel(5, 1000, "white");
        basketArray.addTryfel(tryfel);
        Set<Tryfel> tryfels = basketArray.getAllTryfels();
        Assert.assertEquals("Size should be 1", 1, tryfels.size());
        Assert.assertEquals("Added tryfel is really that we add", tryfel, tryfels.iterator().next());
    }

    @Test
    public void testGetTryfelFromOneElementBasket() {
        TryfelBasketCollection basketArray = new TryfelBasketCollection(1);
        Tryfel tryfel = new Tryfel(5, 2000, "black");
        basketArray.addTryfel(tryfel);
        Tryfel tryfelFromBasket = basketArray.getTryfel();
        Assert.assertEquals(0, basketArray.getCurrentSize());
        Assert.assertEquals(tryfel, tryfelFromBasket);

    }

    @Test
    public void testAddTryfelToZeroElementBasket() {
        TryfelBasketCollection basketArray = new TryfelBasketCollection(0);
        Tryfel tryfel = new Tryfel(5, 3000, "black");
        basketArray.addTryfel(tryfel);
        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetTryfelToZeroElementBasket() {
        TryfelBasketCollection basketArray = new TryfelBasketCollection(0);
        Tryfel tryfelFromBasket = basketArray.getTryfel();

    }

    @Test
    public void testAddTryfel() {
        TryfelBasketCollection basketArray = new TryfelBasketCollection(3);
        basketArray.addTryfel(new Tryfel(1, 5000, "white"));
        basketArray.addTryfel(new Tryfel(2, 8000, "green"));
        Assert.assertEquals(2, basketArray.getCurrentSize());
    }

    @Test
    public void testAddTryfelToFullBasket() {
        TryfelBasketCollection basketArray = new TryfelBasketCollection(3);
        Tryfel whiteTryfel = new Tryfel(1, 5000, "white");
        Tryfel greenTryfel = new Tryfel(1, 5000, "white");
        Tryfel brownTryfel = new Tryfel(1, 5000, "white");
        Tryfel redTryfel = new Tryfel(1, 5000, "white");
        basketArray.addTryfel(whiteTryfel);
        basketArray.addTryfel(greenTryfel);
        basketArray.addTryfel(brownTryfel);
        basketArray.addTryfel(redTryfel);
        Assert.assertEquals(3, basketArray.getCurrentSize());
        Set<Tryfel> tryfels = basketArray.getAllTryfels();

        Assert.assertTrue("Basket should contain white Tryfel",tryfels.contains(whiteTryfel));
        Assert.assertTrue("Basket should contain green Tryfel",tryfels.contains(greenTryfel));
        Assert.assertTrue("Basket should contain brown Tryfel",tryfels.contains(brownTryfel));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetTryfelFromEmptyBasket() {
        TryfelBasketCollection basketArray = new TryfelBasketCollection(3);
        basketArray.getTryfel();
    }

    @Test
    public void testAddandGetTryfels() {
        TryfelBasketCollection basketArray = new TryfelBasketCollection(3);
        Tryfel whiteTryfel = new Tryfel(1, 5000, "white");
        Tryfel greenTryfel = new Tryfel(2, 5000, "green");
        Tryfel brownTryfel = new Tryfel(3, 5000, "brown");
        Tryfel redTryfel = new Tryfel(4, 5000, "red");
        basketArray.addTryfel(whiteTryfel);
        basketArray.addTryfel(greenTryfel);
        basketArray.addTryfel(brownTryfel);
        basketArray.addTryfel(redTryfel);
        Assert.assertEquals(3, basketArray.getCurrentSize());
        /*Assert.assertEquals(brownTryfel, basketArray.getTryfel());
        Assert.assertEquals(greenTryfel, basketArray.getTryfel());
        Assert.assertEquals(whiteTryfel, basketArray.getTryfel());*/
        List<Tryfel> testTryfels = new ArrayList<>();
        testTryfels.add(whiteTryfel);
        testTryfels.add(greenTryfel);
        testTryfels.add(brownTryfel);

        Tryfel currentTestTryfel = basketArray.getTryfel();
        Assertions.assertThat(currentTestTryfel).isIn(testTryfels);
        testTryfels.remove(currentTestTryfel);

        currentTestTryfel = basketArray.getTryfel();
        Assertions.assertThat(currentTestTryfel).isIn(testTryfels);
        testTryfels.remove(currentTestTryfel);

        currentTestTryfel = basketArray.getTryfel();
        Assertions.assertThat(currentTestTryfel).isIn(testTryfels);
        testTryfels.remove(currentTestTryfel);

        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test
    public void testWeigtOfBasket() {
        TryfelBasketCollection basketArray = new TryfelBasketCollection(4);
        Tryfel whiteTryfel = new Tryfel(1, 5000, "white");
        Tryfel greenTryfel = new Tryfel(2, 5000, "green");
        Tryfel brownTryfel = new Tryfel(3, 5000, "brown");
        basketArray.addTryfel(whiteTryfel);
        basketArray.addTryfel(greenTryfel);
        basketArray.addTryfel(brownTryfel);
        Assert.assertEquals("Weight of the basket",6, basketArray.getWeight());
    }

    @Test
    public void testCollectionTryfelsBasket() {
        TryfelBasketCollection basketArray = new TryfelBasketCollection(4);
        Tryfel whiteTryfel = new Tryfel(1, 5000, "white");
        Tryfel greenTryfel = new Tryfel(2, 5000, "green");
        Tryfel brownTryfel = new Tryfel(3, 5000, "brown");
        basketArray.addTryfel(whiteTryfel);
        basketArray.addTryfel(greenTryfel);
        basketArray.addTryfel(brownTryfel);
        Assert.assertEquals("Weight of the basket",6, basketArray.getWeight());
    }
}

