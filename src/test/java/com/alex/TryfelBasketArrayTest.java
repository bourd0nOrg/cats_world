package com.alex;

import com.alex.eat.Tryfel;
import com.alex.eat.TryfelBasketArray;
import org.junit.Assert;
import org.junit.Test;

public class TryfelBasketArrayTest {

    @Test
    public void testAddTryfeltoOneElementBasket() {
        TryfelBasketArray basketArray = new TryfelBasketArray(1);
        Tryfel tryfel = new Tryfel(5, 1000, "white");
        basketArray.addTryfel(tryfel);
        Tryfel[] tryfels = basketArray.getAllTryfels();
        Assert.assertEquals("Size should be 1", 1, tryfels.length);
        Assert.assertEquals("Added tryfel is really that we add", tryfel, tryfels[0]);
    }

    @Test
    public void testGetTryfelFromOneElementBasket() {
        TryfelBasketArray basketArray = new TryfelBasketArray(1);
        Tryfel tryfel = new Tryfel(5, 2000, "black");
        basketArray.addTryfel(tryfel);
        Tryfel tryfelFromBasket = basketArray.getTryfel();
        Assert.assertEquals(0, basketArray.getCurrentSize());
        Assert.assertEquals(tryfel, tryfelFromBasket);

    }

    @Test
    public void testAddTryfelToZeroElementBasket() {
        TryfelBasketArray basketArray = new TryfelBasketArray(0);
        Tryfel tryfel = new Tryfel(5, 3000, "black");
        basketArray.addTryfel(tryfel);
        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetTryfelToZeroElementBasket() {
        TryfelBasketArray basketArray = new TryfelBasketArray(0);
        Tryfel tryfelFromBasket = basketArray.getTryfel();

    }

    @Test
    public void testAddTryfel() {
        TryfelBasketArray basketArray = new TryfelBasketArray(3);
        basketArray.addTryfel(new Tryfel(1, 5000, "white"));
        basketArray.addTryfel(new Tryfel(2, 8000, "green"));
        Assert.assertEquals(2, basketArray.getCurrentSize());
    }

    @Test
    public void testAddTryfelToFullBasket() {
        TryfelBasketArray basketArray = new TryfelBasketArray(3);
        Tryfel whiteTryfel = new Tryfel(1, 5000, "white");
        Tryfel greenTryfel = new Tryfel(1, 5000, "white");
        Tryfel brownTryfel = new Tryfel(1, 5000, "white");
        Tryfel redTryfel = new Tryfel(1, 5000, "white");
        basketArray.addTryfel(whiteTryfel);
        basketArray.addTryfel(greenTryfel);
        basketArray.addTryfel(brownTryfel);
        basketArray.addTryfel(redTryfel);
        Assert.assertEquals(3, basketArray.getCurrentSize());
        Tryfel[] tryfels = basketArray.getAllTryfels();
        Assert.assertEquals(whiteTryfel, tryfels[0]);
        Assert.assertEquals(greenTryfel, tryfels[1]);
        Assert.assertEquals(brownTryfel, tryfels[2]);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetTryfelFromEmptyBasket() {
        TryfelBasketArray basketArray = new TryfelBasketArray(3);
        basketArray.getTryfel();
    }

    @Test
    public void testAddandGetTryfels() {
        TryfelBasketArray basketArray = new TryfelBasketArray(3);
        Tryfel whiteTryfel = new Tryfel(1, 5000, "white");
        Tryfel greenTryfel = new Tryfel(2, 5000, "green");
        Tryfel brownTryfel = new Tryfel(3, 5000, "brown");
        Tryfel redTryfel = new Tryfel(4, 5000, "red");
        basketArray.addTryfel(whiteTryfel);
        basketArray.addTryfel(greenTryfel);
        basketArray.addTryfel(brownTryfel);
        basketArray.addTryfel(redTryfel);
        Assert.assertEquals(3, basketArray.getCurrentSize());
        Assert.assertEquals(brownTryfel, basketArray.getTryfel());
        Assert.assertEquals(greenTryfel, basketArray.getTryfel());
        Assert.assertEquals(whiteTryfel, basketArray.getTryfel());
        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test
    public void testWeigtOfBasket() {
        TryfelBasketArray basketArray = new TryfelBasketArray(4);
        Tryfel whiteTryfel = new Tryfel(1, 5000, "white");
        Tryfel greenTryfel = new Tryfel(2, 5000, "green");
        Tryfel brownTryfel = new Tryfel(3, 5000, "brown");
        basketArray.addTryfel(whiteTryfel);
        basketArray.addTryfel(greenTryfel);
        basketArray.addTryfel(brownTryfel);
        Assert.assertEquals("Weight of the basket",6, basketArray.getWeight());
    }
}

