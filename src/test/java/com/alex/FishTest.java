package com.alex;

import com.alex.eda.Ikra;
import com.alex.exceptions.PetIsDeadException;
import com.alex.pets.Fish;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;


public class FishTest {


    @Test
    public void FishtestMetatIkra() throws Exception {
        Fish fish = new Fish("ocun");
        Ikra ikra = new Ikra("ikra");
        fish.metatIkra(ikra);
        Assert.assertFalse(ikra.isEst());
    }


    @Test(expected = PetIsDeadException.class)
    public void PetIsDeadException()
            throws Exception {
        Fish fish = new Fish("ocun");
        Ikra ikra = new Ikra("ikra");
        fish.kill();
        fish.metatIkra(ikra);
        Assert.assertFalse(ikra.isEst());
    }
    
}