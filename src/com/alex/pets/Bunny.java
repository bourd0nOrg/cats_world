package com.alex.pets;

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

    public void sleep() {
        if (isAlive) {
            System.out.println("Bunny " + name + " is sleep");
        } else {
            System.out.println(">^.^< RIP");
        }
    }

    public void eat(Object object) {
        if (isAlive) {
            System.out.println("Bunny " + name + " eat " + object);
        } else {
            System.out.println(">^.^< RIP");
        }
    }

    public void hide() {
        if (isAlive) {
            System.out.println("Bunny " + name + " is hiding");
        } else {
            System.out.println(">^.^< RIP");
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