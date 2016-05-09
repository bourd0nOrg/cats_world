package com.alex;

import com.alex.eat.Cabbage;
import com.alex.eat.CabbageBasketArray;
import org.junit.Assert;
import org.junit.Test;

public class CabbageBasketArrayTest {

    @Test
    public void testAddCabbageToOneElementBasket(){
        CabbageBasketArray basketArray = new CabbageBasketArray(1);
        Cabbage cabbage = new Cabbage(1, "green");
        basketArray.addCabbage(cabbage);
        Cabbage[] cabbages = basketArray.getCabbages();
        Assert.assertEquals("Size should be 1", 1, cabbages.length);
    }
}
