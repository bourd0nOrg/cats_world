package com.alex;

import com.alex.main.MainClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SimpleCompileTest {

    @Test
    public void testMain() {
        MainClass.main(new String[]{});
    }

    @Test
    public void fakeTest() {
        assertNotNull(null);
    }
}
