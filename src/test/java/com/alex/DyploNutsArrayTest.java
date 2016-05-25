package com.alex;

import com.alex.eat.DyploNutsArray;
import com.alex.eat.Nut;
import com.alex.plants.Dyplo;
import org.junit.Assert;
import org.junit.Test;

public class DyploNutsArrayTest {
    @Test
    public void testAddNutToOneElementDyplo() {
        DyploNutsArray dyploArray = new DyploNutsArray(1);
        Nut nut = new Nut(10, "kedr");
        dyploArray.addNut(nut);
        Nut[] nuts = dyploArray.getAllNuts();
        Assert.assertEquals("Size should be 1", 1, nuts.length);
        Assert.assertEquals("Added nut is really that we add", nut, nuts[0]);
    }

    @Test
    public void testGetNutFromOneElementDyplo() {
        DyploNutsArray dyploArray = new DyploNutsArray(1);
        Nut nut = new Nut(10, "kedr");
        dyploArray.addNut(nut);
        Nut nutFromeDyplo = dyploArray.getNut();
        Assert.assertEquals(nut, nutFromeDyplo);
    }

    @Test
    public void testGetNutToZeroElementDyplo() {
        DyploNutsArray dyploArray = new DyploNutsArray(0);
        Nut nut = new Nut(10, "kedr");
        dyploArray.addNut(nut);
        Assert.assertEquals(0, dyploArray.getCurrentSize());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetNutFromZeroElementDyplo() {
        DyploNutsArray dyploArray = new DyploNutsArray(0);
        Nut nutFromDyplo = dyploArray.getNut();
    }

    @Test
    public void testAddNut() {
        DyploNutsArray dyploArray = new DyploNutsArray(3);
        dyploArray.addNut(new Nut(1, "kedr"));
        dyploArray.addNut(new Nut(2, "shishka"));
        Assert.assertEquals(2, dyploArray.getCurrentSize());
    }

    @Test
    public void testAddNutToFullDyplo() {
        DyploNutsArray dyploArray = new DyploNutsArray(3);
        Nut kedrNut = new Nut(1, "kedr");
        Nut shishkaNut = new Nut(2, "shishka");
        Nut semyNut = new Nut(3, "semy");
        Nut gelydNut = new Nut(4, "gelyd");

        dyploArray.addNut(kedrNut);
        dyploArray.addNut(shishkaNut);
        dyploArray.addNut(semyNut);
        dyploArray.addNut(gelydNut);

        Assert.assertEquals(3, dyploArray.getCurrentSize());
        Nut[] nuts = dyploArray.getAllNuts();
        Assert.assertEquals(kedrNut, nuts[0]);
        Assert.assertEquals(shishkaNut, nuts[1]);
        Assert.assertEquals(semyNut, nuts[2]);
    }

    @Test(expected = IllegalStateException.class)
    public void testGetNutFromEmptyDyplo() {
        DyploNutsArray dyploArray = new DyploNutsArray(3);
        dyploArray.getNut();

    }

    @Test
    public void testGetCurrentNut() {
        DyploNutsArray dyploArray = new DyploNutsArray(3);

        Nut kedrNut = new Nut(1, "kedr");
        Nut shishkaNut = new Nut(2, "shishka");
        Nut semyNut = new Nut(3, "semy");
        Nut gelydNut = new Nut(4, "gelyd");

        dyploArray.addNut(kedrNut);
        dyploArray.addNut(shishkaNut);
        dyploArray.addNut(semyNut);
        dyploArray.addNut(gelydNut);

        Assert.assertEquals(3, dyploArray.getCurrentSize());
        Assert.assertEquals(semyNut, dyploArray.getNut());
        Assert.assertEquals(shishkaNut, dyploArray.getNut());
        Assert.assertEquals(kedrNut, dyploArray.getNut());
        Assert.assertEquals(0, dyploArray.getCurrentSize());
    }

    @Test
    public void testWeightOfDyplo() {
        DyploNutsArray dyploArray = new DyploNutsArray(3);
        Nut kedrNut = new Nut(1, "kedr");
        Nut shishkaNut = new Nut(2, "shishka");
        Nut semyNut = new Nut(3, "semy");

        dyploArray.addNut(kedrNut);
        dyploArray.addNut(shishkaNut);
        dyploArray.addNut(semyNut);

        Assert.assertEquals(6,dyploArray.getWeight());
    }

}
