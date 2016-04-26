package com.alex.plants;

import com.alex.pets.Bunny;
import com.alex.pets.Cow;

public class Grass {

    protected String breed;

    public Grass(String breed) {
        super();
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void poisoning(Object object) {
        if (object instanceof Cow) {
            System.out.println("Grass " + breed + " food for Cow");
        } else {
            System.out.println("Grass " + breed + " poisoning " + object.toString());
        }
    }
}


