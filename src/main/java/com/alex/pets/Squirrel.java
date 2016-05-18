package com.alex.pets;

import com.alex.exceptions.PetIsDeadException;
import com.alex.plants.Dyplo;

public class Squirrel extends Pet implements Alive {

    private String name;
    private String breed;

    public Squirrel(String someName, String breed) {
        super();
        this.name = someName;
        this.breed = breed;

    }


    public void eat(Object nut) {
        if (!isAlive) {
            throw new PetIsDeadException(this);
        } else {
            System.out.println("Squirrel " + name + " eat " + nut);
        }
    }

    public void jump() {
        if (!isAlive) {
            throw new PetIsDeadException(this);
        } else {
            System.out.println("Squirrel " + name + " is jumping");
        }
    }

    public void store(Object object) {
        if (!isAlive) {
            System.out.println("Squirrel distress");
            throw new PetIsDeadException(this);
        } else {
            if (object instanceof Dyplo) {
                Dyplo dyplo = (Dyplo) object;
                dyplo.store(this);
                System.out.println("The squirrel " + name + " stores nuts in a hollow");
            }
        }
    }


    public String getName() {
        return name;
    }

    public String toString() {
        return "Squirrel " + name;
    }

    public String getBreed() {
        return breed;
    }

}
