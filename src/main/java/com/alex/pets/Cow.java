package com.alex.pets;

import com.alex.exceptions.PetIsDeadException;
import com.alex.plants.Clover;
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
        if (isAlive) {
            System.out.println(breed + " Cow " + name + " is pasture");
        } else {
            System.out.println("Cow is dead");
        }
    }

    public void eat(Grass grass) {
        if (isAlive) {
            System.out.println(breed + " Cow " + name + " eat " + grass.getBreed());
            throw new PetIsDeadException(this);
        } else {
            System.out.println("Cow is dead");
        }
    }


    public void moo() {
        if (isAlive) {
            System.out.println(breed + " Cow " + name + " is moo");
        } else {
            System.out.println("Cow is dead");
        }
    }


    public String getName() {return name;}
    public String toString() {return "Cow " + name;}
    public String getBreed() {return breed;}
    }