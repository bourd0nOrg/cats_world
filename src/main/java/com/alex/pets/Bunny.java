package com.alex.pets;

import com.alex.exceptions.PetIsDeadException;
import com.alex.plants.Clover;

public class Bunny extends Pet implements Alive {

    private String name;
    private String breed;
    private String color;

    public Bunny(String someName, String breed, String color) {
        super();
        this.name = someName;
        this.breed = breed;
        this.color = color;
    }

    public void jump() {

        if (!isAlive()) {
            System.out.println(">^.^< RIP");
            throw new PetIsDeadException(this);
        } else {
            System.out.println("Bunny " + name + " is jumping");
        }
    }


    public void eat(Object object) {

        if (!isAlive()) {
            System.out.println(">^.^< RIP");
            throw new PetIsDeadException(this);
        } else {
            if (object instanceof Clover) {
                Clover clover = (Clover) object;
                clover.poisoning(this);
                System.out.println("Bunny " + name + " eat " + clover);
            }
        }
    }


    public void hide() {
        if (!isAlive()) {
            System.out.println(">^.^< RIP");
            throw new PetIsDeadException(this);
        } else {
            System.out.println("Bunny " + name + " is hiding");
        }
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

    public String toString() {
        return "Bunny " + name;
    }

}