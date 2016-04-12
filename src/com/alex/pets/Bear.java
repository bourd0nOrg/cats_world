package com.alex.pets;

public class Bear extends Pet implements Alive {

    private String name;
    private String breed;
    private String color;

    public Bear(String someName, String breed, String color) {
        super();
        this.name = someName;
        this.breed = breed;
        this.color = color;
    }

    public void sleep() {
        if (isAlive) {
            System.out.println("Bear " + name + " is sleep");
        } else {
            System.out.println("....dead.");
        }
    }

    public void eat(Object object) {
        if (isAlive) {
            System.out.println("Bear " + name + " eat " + object);
        } else {
            System.out.println("....dead");
        }
    }

    public void attack(Object object) {
        if (isAlive) {
            System.out.println("Bear " + name + " attack " + object);
        } else {
            System.out.println("....dead");
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
        return "Bear " + name;
    }

}