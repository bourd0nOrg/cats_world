package com.alex;

import com.alex.eat.Tryfel;
import com.alex.eat.TryfelBasketArray;
import com.sun.xml.internal.bind.v2.runtime.IllegalAnnotationException;
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
    public void testAddTryfel(){
        TryfelBasketArray basketArray = new TryfelBasketArray(3);
        basketArray.addTryfel(new Tryfel(1, 5000, "white"));
        basketArray.addTryfel(new Tryfel(2, 8000, "green"));
        Assert.assertEquals(2, basketArray.getCurrentSize());
    }

    @Test
    public void testAddTryfelToFullBasket(){
        TryfelBasketArray basketArray = new TryfelBasketArray(3);
        basketArray.addTryfel(new Tryfel(1, 5000, "white"));
        basketArray.addTryfel(new Tryfel(2, 8000, "green"));
        basketArray.addTryfel(new Tryfel(3, 13000, "brown"));
        basketArray.addTryfel(new Tryfel(4, 25000, "red"));
        Assert.assertEquals(3, basketArray.getCurrentSize());
    }
}

