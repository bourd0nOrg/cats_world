package com.alex;


import com.alex.eat.DyploNutsCollection;
import com.alex.eat.Nut;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DyploNutsCollectionTest {
    @Test
    public void testAddNutToOneElementDyplo() {
        DyploNutsCollection dyploCollection = new DyploNutsCollection(1);
        Nut nut = new Nut(10, "kedr");
        dyploCollection.addNut(nut);
        Set<Nut> nuts = dyploCollection.getAllNuts();
        Assert.assertEquals("Size should be 1", 1, nuts.size());
        Assert.assertEquals("Added nut is really that we add", nut, nuts.iterator().next());
    }

    @Test
    public void testGetNutFromOneElementDyplo() {
        DyploNutsCollection dyploCollection = new DyploNutsCollection(1);
        Nut nut = new Nut(10, "kedr");
        dyploCollection.addNut(nut);
        Nut nutFromeDyplo = dyploCollection.getNut();
        Assert.assertEquals(nut, nutFromeDyplo);
    }

    @Test
    public void testGetNutToZeroElementDyplo() {
        DyploNutsCollection dyploCollection = new DyploNutsCollection(0);
        Nut nut = new Nut(10, "kedr");
        dyploCollection.addNut(nut);
        Assert.assertEquals(0, dyploCollection.getCurrentSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetNutFromZeroElementDyplo() {
        DyploNutsCollection dyploCollection = new DyploNutsCollection(0);
        Nut nutFromDyplo = dyploCollection.getNut();
    }

    @Test
    public void testAddNut() {
        DyploNutsCollection dyploCollection = new DyploNutsCollection(3);
        dyploCollection.addNut(new Nut(1, "kedr"));
        dyploCollection.addNut(new Nut(2, "shishka"));
        Assert.assertEquals(2, dyploCollection.getCurrentSize());
    }

    @Test
    public void testAddNutToFullDyplo() {
        DyploNutsCollection dyploCollection = new DyploNutsCollection(3);
        Nut kedrNut = new Nut(1, "kedr");
        Nut shishkaNut = new Nut(2, "shishka");
        Nut semyNut = new Nut(3, "semy");
        Nut gelydNut = new Nut(4, "gelyd");

        dyploCollection.addNut(kedrNut);
        dyploCollection.addNut(shishkaNut);
        dyploCollection.addNut(semyNut);
        dyploCollection.addNut(gelydNut);

        Assert.assertEquals(3, dyploCollection.getCurrentSize());
        Set<Nut> nuts = dyploCollection.getAllNuts();

        Assert.assertTrue("Dyplo should contain kedr nut", nuts.contains(kedrNut));
        Assert.assertTrue("Dyplo should contain shishka nut", nuts.contains(shishkaNut));
        Assert.assertTrue("Dyplo should contain semy nut", nuts.contains(semyNut));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetNutFromEmptyDyplo() {
        DyploNutsCollection dyploCollection = new DyploNutsCollection(3);
        dyploCollection.getNut();

    }

    @Test
    public void testGetCurrentNut() {
        DyploNutsCollection dyploArray = new DyploNutsCollection(3);

        Nut kedrNut = new Nut(1, "kedr");
        Nut shishkaNut = new Nut(2, "shishka");
        Nut semyNut = new Nut(3, "semy");
        Nut gelydNut = new Nut(4, "gelyd");

        dyploArray.addNut(kedrNut);
        dyploArray.addNut(shishkaNut);
        dyploArray.addNut(semyNut);
        dyploArray.addNut(gelydNut);

        Assert.assertEquals(3, dyploArray.getCurrentSize());

        List<Nut> testNuts = new ArrayList<>();
        testNuts.add(semyNut);
        testNuts.add(shishkaNut);
        testNuts.add(kedrNut);

        Nut currentTestNut = dyploArray.getNut();
        Assertions.assertThat(currentTestNut).isIn(testNuts);
        testNuts.remove(currentTestNut);

        currentTestNut = dyploArray.getNut();
        Assertions.assertThat(currentTestNut).isIn(testNuts);
        testNuts.remove(currentTestNut);

        currentTestNut = dyploArray.getNut();
        Assertions.assertThat(currentTestNut).isIn(testNuts);
        testNuts.remove(currentTestNut);

        Assert.assertEquals(0, dyploArray.getCurrentSize());
    }

    @Test
    public void testWeightOfDyplo() {
        DyploNutsCollection dyploCollection = new DyploNutsCollection(3);
        Nut kedrNut = new Nut(1, "kedr");
        Nut shishkaNut = new Nut(2, "shishka");
        Nut semyNut = new Nut(3, "semy");

        dyploCollection.addNut(kedrNut);
        dyploCollection.addNut(shishkaNut);
        dyploCollection.addNut(semyNut);

        Assert.assertEquals(6,dyploCollection.getWeight());
    }

}
