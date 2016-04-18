package com.alex.pets;


import com.alex.Eating.Lapa;

public class Bear extends Pet implements Alive {

    protected String breed;

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

    public void sosat() {
        if (isAlive) {
            System.out.println("Bear " + name + " soset lapy");
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

    public void mochit(Object object) {
        if (object instanceof Lapa) {
            Lapa lapa = (Lapa) object;
            if (lapa.wet())
            System.out.println("Bear " + name + " sosal lapy i ona stala mokroy");
        } else {
            System.out.println("Bear ne spit!!!");
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


