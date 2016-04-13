package com.alex;

import com.alex.pets.Jiraf;
import org.junit.Assert;
import org.junit.Test;

public class JirafTest {

    @Test
    public void testJirafHaveCorrectName() {
        Jiraf jiraf = new Jiraf("Adolph", 50);
        Assert.assertEquals("Adolph", jiraf.getName());
    }

    @Test
    public void testJirafHaveCorrectLength() {
        Jiraf jiraf = new Jiraf("Adolph", 50);
        Assert.assertEquals(new Integer (50), jiraf.getLength());
    }
}
