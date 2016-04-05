package com.alex.pets;

public class Pig extends Pet implements Alive {

    private String name;
    private String breed;

    public Pig(String someName, String breed) {
        this.name = someName;
        this.breed = breed;
    }

    public void hryukat() {
        if (isAlive) {
            System.out.println("Pig " + name + " is hryukaet");
        } else {
            System.out.println(";(");
        }
    }

    public void swimming() {
        if (isAlive) {
            System.out.println("Pig " + name + " is swimming v gryazi");
        } else {
            System.out.println(";(");
        }
    }

    public void zhratb() {
        if (isAlive) {
            System.out.println("Pig " + name + " is zhret");
        } else {
            System.out.println(";(");
        }
    }


    public String getName() {
        return name;
    }
    public String toString() {
        return "Pig " + name;
    }
    public String getBreed() {
        return breed;
    }

}