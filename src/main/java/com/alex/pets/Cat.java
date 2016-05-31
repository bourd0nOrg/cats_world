package com.alex.pets;

import com.alex.exceptions.PetIsDeadException;

public class Cat extends Pet implements Alive {

    private String name;
    private String breed;

    public Cat(String someName, String breed) {
        super();
        this.name = someName;
        this.breed = breed;
    }

    public void sleep() {
        if (isAlive) {
            System.out.println("Cat " + name + " is sleep");
        } else {
            System.out.println(";(");
        }
    }

    public void eat(Fish fish) {
        if (isAlive) {
                System.out.println("Cat " + name + " eat " + fish.getBreed());
            } else {
                System.out.println(";(");
            }
        }


    public void play() {
        if (isAlive) {
            System.out.println("Cat " + name + " is playing");
        } else {
            System.out.println(";(");
        }
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }


    public String toString() {
        return "Cat " + name;
    }

}
