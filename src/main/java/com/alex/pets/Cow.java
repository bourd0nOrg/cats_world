package com.alex.pets;

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

    public void moo() {
        if (isAlive) {
            System.out.println(breed + " Cow " + name + " is moo");
        } else {
            System.out.println("Cow explodes");
        }
    }

    public void pasture() {
        if (isAlive) {
            System.out.println(breed + " Cow " + name + " is pasture");
        } else {
            System.out.println("Cow explodes");
        }
    }

    public void eat() {
        if (isAlive) {
            System.out.println(breed + " Cow " + name + " eat");
        } else {
            System.out.println("Cow explodes");
        }
    }


    public String getName() {return name;}

    public String getBreed() {return breed;}
    }