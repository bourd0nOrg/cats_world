package com.alex.plants;


import com.alex.pets.Bunny;
import com.alex.pets.Cow;

public class Clover extends Grass {

    public Clover(String clover) {
        super("clover");
    }

    public void poisoning(Object object) {
        System.out.println("Clover poisoning " + object.toString());

        if (object instanceof Cow) {
            Cow cow = (Cow) object;
            if (cow.isAlive()) {
                cow.kill();
            } else {
                System.out.println("Cow explodes");
            }

        }
        if (object instanceof Bunny) {
            Bunny bunny = (Bunny) object;
            if (bunny.isAlive()) {
                System.out.println(">^.^< RIP");
                bunny.kill();
            } else {
                System.out.println("Bunny explodes");
            }
        }
    }
}




