package com.alex.pets;


import com.alex.Eating.Lapa;

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

    public void grblzt(Lapa lapa) {
        if (isAlive) {
           lapa.namochit();
        } else {
            System.out.println("Bear " + name + "spit");
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

    }


