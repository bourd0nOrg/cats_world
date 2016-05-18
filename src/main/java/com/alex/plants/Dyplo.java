package com.alex.plants;


import com.alex.pets.Squirrel;


public class Dyplo extends Tree {
    public Dyplo(String dyplo) {
        super("dyplo");
    }

    public void store(Object object) {
        System.out.println("Nuts are stored in duplicate of a " + object.toString());
        if (object instanceof Squirrel) {
            Squirrel squirrel = (Squirrel) object;
            if (squirrel.isAlive()) {
                System.out.println("empty doubles - Squirrel died of starvation");
                squirrel.kill();
            } else {
                System.out.println("Squirrel distress");
            }
        }
    }
}