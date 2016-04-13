package com.alex.pets;

public class Wolf extends Pet implements Alive {
    private String name;
    private String breed;

    public Wolf(String someName, String breed) {
        this.name = someName;
        this.breed = breed;
    }

    public void lovit(Object object) {
        System.out.println("Wolf lovit" + object.toString());
        if (object instanceof Cat)
            System.out.println("!!! I kill cat !!!");{
            Cat cat = (Cat) object;
            if (cat.isAlive()) {
                cat.kill();
            } else {
                System.out.println("!!! Cat is dead !!!");
            }
        }
    }


    public void eat(Object object) {

        System.out.println("Wolf eat " + object.toString());

        if (object instanceof Pig)
            System.out.println("!!! I catch pig !!!");
        {
            Pig pig = (Pig) object;
            if (pig.isAlive()) {
                pig.kill();
            } else {
                System.out.println("!!! I eat only alive pig !!!");
            }
        }

    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Wolf " + name;
    }
    public String getBreed() {
        return breed;
    }
}
