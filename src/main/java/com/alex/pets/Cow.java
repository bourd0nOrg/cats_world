package com.alex.pets;

import com.alex.exceptions.PetIsDeadException;

import com.alex.plants.Grass;

public class Cow extends Pet implements Alive {

    private String name;
    private String breed;
    private String weight;

    public Cow(String someName, String breed) {
        this.name = someName;
        this.breed = breed;
        this.weight = weight;
    }


    public void pasture() {
        if (!isAlive()) {
            throw new PetIsDeadException(this);
        }
        System.out.println(breed + " Cow " + name + " is pasture");
    }


    public void eat(Grass grass) {
        if (!isAlive) {
            throw new PetIsDeadException(this);
        }
        System.out.println(breed + " Cow " + name + " eat " + grass.getBreed());
    }


    public void moo() {
        if (!isAlive()) {
            throw new PetIsDeadException(this);
        }
        System.out.println(breed + " Cow " + name + " is moo");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Cow " + name;
    }

    public String getBreed() {
        return breed;
    }
}