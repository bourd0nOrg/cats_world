package com.alex;

import com.alex.eat.Cabbage;
import com.alex.eat.CabbageBasketCollection;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CabbageBasketArrayTest {

    @Test
    public void testAddCabbageToOneElementBasket() {
        CabbageBasketCollection basketArray = new CabbageBasketCollection(1);
        Cabbage cabbage = new Cabbage(1, "green");
        basketArray.addCabbage(cabbage);
        Set<Cabbage> cabbages = basketArray.getCabbages();
        Assert.assertEquals("Size should be 1", 1, cabbages.size());
        Assert.assertEquals("This Cabbage", cabbage, cabbages.iterator().next());
    }

    @Test
    public void testGetCabbageFromeOneElementBasket() {
        CabbageBasketCollection basketArray = new CabbageBasketCollection(1);
        Cabbage cabbage = new Cabbage(1, "green");
        basketArray.addCabbage(cabbage);
        Cabbage cabbageFromBasket = basketArray.getCabbage();
        Assert.assertEquals(0, basketArray.getCurrentSize());
        Assert.assertEquals(cabbage, cabbageFromBasket);
    }

    @Test
    public void testAddCabbageToZeroElementBasket() {
        CabbageBasketCollection basketArray = new CabbageBasketCollection(0);
        Cabbage cabbage = new Cabbage(1, "green");
        basketArray.addCabbage(cabbage);
        Assert.assertEquals(0, basketArray.getCurrentSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCabbageFromZeroElementBasket() {
        CabbageBasketCollection basketArray = new CabbageBasketCollection(0);
        Cabbage cabbageFromBasket = basketArray.getCabbage();
    }

    @Test
    public void testAddCabbage() {
        CabbageBasketCollection basketArray = new CabbageBasketCollection(3);
        basketArray.addCabbage(new Cabbage(1, "green"));
        basketArray.addCabbage(new Cabbage(2, "multicolor"));
        Assert.assertEquals(2, basketArray.getCurrentSize());
    }

    @Test
    public void testAddCabbageToFullBasket() {
        CabbageBasketCollection basketArray = new CabbageBasketCollection(3);

        Cabbage greenCabbage = new Cabbage(1, "green");
        Cabbage multicolorCabbage = new Cabbage(2, "multicolor");
        Cabbage yellowCabbage = new Cabbage(3, "yellow");
        Cabbage blueCabbage = new Cabbage(4, "blue");

        basketArray.addCabbage(greenCabbage);
        basketArray.addCabbage(multicolorCabbage);
        basketArray.addCabbage(yellowCabbage);
        basketArray.addCabbage(blueCabbage);

        Assert.assertEquals(3, basketArray.getCurrentSize());
        Set<Cabbage> cabbages = basketArray.getCabbages();

        Assert.assertTrue("Basket", cabbages.contains(greenCabbage));
        Assert.assertTrue("Basket", cabbages.contains(multicolorCabbage));
        Assert.assertTrue("Basket", cabbages.contains(yellowCabbage));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCabbageFromEmptyBasket() {
        CabbageBasketCollection basketArray = new CabbageBasketCollection(3);
        basketArray.getCabbage();
    }

    @Test

    public void testGetCabbageEmptyBasket() {
        CabbageBasketCollection basketArray = new CabbageBasketCollection(4);

        Cabbage greenCabbage = new Cabbage(1, "green");
        Cabbage multicolorCabbage = new Cabbage(2, "multicolor");
        Cabbage yellowCabbage = new Cabbage(3, "yellow");
        Cabbage blueCabbage = new Cabbage(4, "blue");

        basketArray.addCabbage(greenCabbage);
        basketArray.addCabbage(multicolorCabbage);
        basketArray.addCabbage(yellowCabbage);
        basketArray.addCabbage(blueCabbage);

        Assert.assertEquals(4, basketArray.getCurrentSize());

        List<Cabbage> testCabbages = new ArrayList<>();
        testCabbages.add(blueCabbage);
        testCabbages.add(yellowCabbage);
        testCabbages.add(multicolorCabbage);
        testCabbages.add(greenCabbage);

        Cabbage currentTestCabbage = basketArray.getCabbage();
        Assertions.assertThat(currentTestCabbage).isIn(testCabbages);
        testCabbages.remove(currentTestCabbage);

        currentTestCabbage = basketArray.getCabbage();
        Assertions.assertThat(currentTestCabbage).isIn(testCabbages);
        testCabbages.remove(currentTestCabbage);

        currentTestCabbage = basketArray.getCabbage();
        Assertions.assertThat(currentTestCabbage).isIn(testCabbages);
        testCabbages.remove(currentTestCabbage);

        Assert.assertEquals(1, basketArray.getCurrentSize());

    }

    @Test

    public void testWeightOfBasket() {
        CabbageBasketCollection basketArray = new CabbageBasketCollection(4);

        Cabbage greenCabbage = new Cabbage(1, "green");
        Cabbage multicolorCabbage = new Cabbage(2, "multicolor");
        Cabbage yellowCabbage = new Cabbage(3, "yellow");

        basketArray.addCabbage(greenCabbage);
        basketArray.addCabbage(multicolorCabbage);
        basketArray.addCabbage(yellowCabbage);

        Assert.assertEquals(6, basketArray.getWeight());

    }


    @Test

    public void testCabbageBasketCollection() {
        CabbageBasketCollection basketArray = new CabbageBasketCollection(4);

        Cabbage greenCabbage = new Cabbage(1, "green");
        Cabbage multicolorCabbage = new Cabbage(2, "multicolor");
        Cabbage yellowCabbage = new Cabbage(3, "yellow");

        basketArray.addCabbage(greenCabbage);
        basketArray.addCabbage(multicolorCabbage);
        basketArray.addCabbage(yellowCabbage);

        Assert.assertEquals(6, basketArray.getWeight());
    }
}