package com.alex;

import com.alex.eat.DyploNutsArray;
import com.alex.eat.Nut;
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
    }
}
