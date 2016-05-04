package com.alex.pets;


public class Sheep extends Pet implements Alive {
    private static String name;

    public Sheep(String someName) {
        this.name = someName;
    }

    public static String getName() {
        return name;
    }

    public void eat(Object object) {

        if (object instanceof Dragon) {
            System.out.println("Sheep" + name + "can't eat dragon");
        } else {
            System.out.println("Sheep" + name + " eat " + object.toString());
        }
    }
}

