package com.alex;

import com.alex.eat.Tryfel;
import com.alex.eat.TryfelBasketArray;
import org.junit.Assert;
import org.junit.Test;

public class TryfelBasketArrayTest {

    @Test
    public void testAddTryfeltoOneElementBasket(){
        TryfelBasketArray basketArray = new TryfelBasketArray(1);
        Tryfel tryfel = new Tryfel(5, 1, "white");
        basketArray.addTryfel(tryfel);
        Tryfel[] tryfels = basketArray.getAllTryfels();
        Assert.assertEquals("Size should be 1", 1, tryfels.length);
    }
}
