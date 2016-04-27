package com.alex.pets;

import com.alex.plants.Podorojnik;
import com.alex.plants.ToxicTree;
import com.alex.plants.Tree;

public class Jiraf extends Pet implements Alive {
    private String name;
    private Integer length;

    public Jiraf(String someName, Integer length) {
        this.name = someName;
        this.length = length;
    }

    public void eat(Object object) {
        if (isAlive) {
            System.out.println("Jiraf " + name + " eat " + object);
        } else {
            System.out.println("Jiraf is dead");
        }
        if (object instanceof ToxicTree) {
            poison();
        }
        if (object instanceof Podorojnik) {
            Podorojnik podorojnik = (Podorojnik) object;
            podorojnik.heal(this);
        }
    }


    public String getName() {
        return name;
    }

    public Integer getLength() {
        return length;
    }
}
