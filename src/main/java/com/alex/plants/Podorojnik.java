package com.alex.plants;

import com.alex.pets.Jiraf;

/**
 * Created by Студент on 27.04.2016.
 */
public class Podorojnik {
    protected String breed;

    public Podorojnik (String breed) {
        super();
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }



    public void heal(Object object) {
        System.out.println("Podorojnik healing " + object.toString());
        if (object instanceof Jiraf) {
            Jiraf jiraf = (Jiraf) object;
            if (jiraf.isAlive())
                if (jiraf.isPoisoned()) {
                    jiraf.heal();
                } else {
                    System.out.println("nyam");
                }
            else {
                System.out.println("The dead do not eat");
            }
        }
    }
}

