package com.alex;

import com.alex.eat.Carrot;
import com.alex.eat.CarrotBasketArray;
import org.junit.Assert;
import org.junit.Test;

public class TestCarrotBasket {

    @Test
    public void testAddCarrotToOneElementBasket(){
        CarrotBasketArray basketArray = new CarrotBasketArray(1);
        Carrot carrot = new Carrot(7, "orange");
        basketArray.addCarrot(carrot);
        Carrot [] carrots = basketArray.getAllCarrots();
        Assert.assertEquals("Size should be 1", 1, carrots.length);
    }

}
