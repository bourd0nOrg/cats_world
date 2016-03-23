package com.alex.pets;

public class Fish extends Pet implements Alive {

    protected String breed;

    public Fish(String breed) {
        super();
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void eat(Object object) {
        if (object instanceof Cat) {
            System.out.println("!!! Fish " + breed + " can't eat cat");
        } else {
            System.out.println("Fish " + breed + " eat " + object.toString());
        }
    }

}
