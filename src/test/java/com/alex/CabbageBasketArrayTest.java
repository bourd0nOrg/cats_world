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

        basketArray.addCabbage(greenCabbage);
        basketArray.addCabbage(multicolorCabbage);
        basketArray.addCabbage(yellowCabbage);
        basketArray.addCabbage(blueCabbage);

        Assert.assertEquals(3, basketArray.getCurrentSize());

        Cabbage[] cabbages = basketArray.getCabbages();
        Assert.assertEquals(greenCabbage, cabbages[0]);
        Assert.assertEquals(multicolorCabbage, cabbages[1]);
        Assert.assertEquals(yellowCabbage, cabbages[2]);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCabbageFromEmptyBasket() {
        CabbageBasketArray basketArray = new CabbageBasketArray(3);
        basketArray.getCabbage();
    }

    @Test

    public void testGetCabbageEmptyBasket() {
        CabbageBasketArray basketArray = new CabbageBasketArray(4);

        Cabbage greenCabbage = new Cabbage(1, "green");
        Cabbage multicolorCabbage = new Cabbage(2, "multicolor");
        Cabbage yellowCabbage = new Cabbage(3, "yellow");
        Cabbage blueCabbage = new Cabbage(4, "blue");

        basketArray.addCabbage(greenCabbage);
        basketArray.addCabbage(multicolorCabbage);
        basketArray.addCabbage(yellowCabbage);
        basketArray.addCabbage(blueCabbage);

        Assert.assertEquals(4, basketArray.getCurrentSize());

        Assert.assertEquals(blueCabbage, basketArray.getCabbage());
        Assert.assertEquals(yellowCabbage, basketArray.getCabbage());
        Assert.assertEquals(multicolorCabbage, basketArray.getCabbage());
        Assert.assertEquals(greenCabbage, basketArray.getCabbage());

    }

    @Test

    public void testWeightOfBasket(){
        CabbageBasketArray basketArray = new CabbageBasketArray(4);

        Cabbage greenCabbage = new Cabbage(1, "green");
        Cabbage multicolorCabbage = new Cabbage(2, "multicolor");
        Cabbage yellowCabbage = new Cabbage(3, "yellow");

        basketArray.addCabbage(greenCabbage);
        basketArray.addCabbage(multicolorCabbage);
        basketArray.addCabbage(yellowCabbage);

        Assert.assertEquals(6, basketArray.getWeight());

    }
}
