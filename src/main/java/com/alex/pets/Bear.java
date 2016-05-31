package com.alex.pets;


import com.alex.eat.Lapa;
import com.alex.exceptions.PetIsDeadException;

public class Bear extends Pet implements Alive {

    public String breed;

    public Bear() {
        super();
    }


    private String name;

    private String color;

    public Bear(String someName, String breed, String color) {
        this.name = someName;
        this.breed = breed;
        this.color = color;

    }

    public void sleep() {

        if (!isAlive()) {
            throw new PetIsDeadException(this);
        }
        System.out.println("Bear " + name + " is sleep");
    }


    public void eat(Object object) {
        if (!isAlive()) {
            throw new PetIsDeadException(this);
        }
        System.out.println("Bear " + name + " eat " + object);
    }


    public void grblzt(Lapa lapa) {
        if (!isAlive()) {
            throw new PetIsDeadException(this);
        }
        lapa.namochit();
    }


    public void attack(Object object) {
        if (!isAlive()) {
            throw new PetIsDeadException(this);
        }
        System.out.println("Bear " + name + " attack " + object);
    }


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

}


