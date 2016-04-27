package com.alex.plants;


import com.alex.pets.Cow;

public class Straw {

    protected String breed;

    public Straw(String breed) {
        super();
        this.breed = breed;
    }

    public String getBreed() { return breed; }

    public void poisoning(Object object) {

        if(object instanceof Cow){
            System.out.println("Straw " + breed + "food for Cow");
        }else {
            System.out.println(object.toString() + "don't eat straw.");
        }

    }

}
