package com.alex;

import com.alex.eat.Cabbage;
import com.alex.eat.CabbageBasketArray;
import org.junit.Assert;
import org.junit.Test;

public class CabbageBasketArrayTest {

    @Test
    public void testAddCabbageToOneElementBasket() {
        CabbageBasketArray basketArray = new CabbageBasketArray(1);
        Cabbage cabbage = new Cabbage(1, "green");
        basketArray.addCabbage(cabbage);
        Cabbage[] cabbages = basketArray.getCabbages();
        Assert.assertEquals("Size should be 1", 1, cabbages.length);
        Assert.assertEquals("This Cabbage", cabbage, cabbages[0]);
    }

    @Test
    public void testGetCabbageFromeOneElementBasket() {
        CabbageBasketArray basketArray = new CabbageBasketArray(1);
        Cabbage cabbage = new Cabbage(1, "green");
        basketArray.addCabbage(cabbage);
        Cabbage cabbageFromBasket = basketArray.getCabbage();
        Assert.assertEquals(0, basketArray.getCurrentSize());
        Assert.assertEquals(cabbage, cabbageFromBasket);

    }

    @Test
    public void testAddCabbageToZeroElementBasket() {
        CabbageBasketArray basketArray = new CabbageBasketArray(0);
        Cabbage cabbage = new Cabbage(1, "green");
        basketArray.addCabbage(cabbage);
        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCabbageFromZeroElementBasket() {
        CabbageBasketArray basketArray = new CabbageBasketArray(0);
        Cabbage cabbageFromBasket = basketArray.getCabbage();
    }

    @Test
    public void testAddCabbage() {
        CabbageBasketArray basketArray = new CabbageBasketArray(3);
        basketArray.addCabbage(new Cabbage(1, "green"));
        basketArray.addCabbage(new Cabbage(2, "multicolor"));
        Assert.assertEquals(2, basketArray.getCurrentSize());
    }

    @Test
    public void testAddCabbageToFullBasket() {
        CabbageBasketArray basketArray = new CabbageBasketArray(3);
        Cabbage greenCabbage = new Cabbage(1, "green");
        Cabbage multicolorCabbage = new Cabbage(2, "multicolor");
        Cabbage yellowCabbage = new Cabbage(3, "yellow");
        Cabbage blueCabbage = new Cabbage(4, "blue");

        basketArray.addCabbage(new Cabbage(1, "green"));
        basketArray.addCabbage(new Cabbage(2, "multicolor"));
        basketArray.addCabbage(new Cabbage(3, "yellow"));
        basketArray.addCabbage(new Cabbage(4, "blue"));

        Assert.assertEquals(3, basketArray.getCurrentSize());
        Cabbage[] cabbages = basketArray.getCabbages();
        Assert.assertEquals(greenCabbage, cabbages[0]);
        Assert.assertEquals(multicolorCabbage, cabbages[1]);
        Assert.assertEquals(yellowCabbage, cabbages[2]);
        Assert.assertEquals(blueCabbage, cabbages[3]);
    }
}
