package com.alex.pets;

public class Squirrel extends Pet implements Alive {

    private String name;
    private String breed;
    public Squirrel(String someName, String breed) {
        super();
        this.name = someName;
        this.breed = breed;
    }

    public void tsocaet() {
        if (isAlive) {
            System.out.println("Squirrel " + name + " is tsocaet");
        } else {
            System.out.println(";(");
        }
    }

    public void sleep() {
        if (isAlive) {
            System.out.println("Squirrel " + name + " is sleep");
        } else {
            System.out.println(";(");
        }
    }

    public void eat(Object nut) {
        if (isAlive) {
            System.out.println("Squirrel " + name + " eat " + nut);
        } else {
            System.out.println(";(");
        }
    }

    public void jump() {
        if (isAlive) {
            System.out.println("Squirrel " + name + " is jumping");
        } else {
            System.out.println(";(");
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