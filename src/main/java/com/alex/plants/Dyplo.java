package com.alex.plants;


import com.alex.pets.Squirrel;

public class Dyplo {
        protected String breed;
    public Dyplo(String breed) {
        super();
        this.breed = breed;
    }

    public  String getBreed() { return  breed; }

    public void poisoning(Object object){
        if(object instanceof Squirrel){
            System.out.println("Dyplo " + breed + "ckladuvat squirrel");
        }else {
            System.out.println(object.toString() + "no ckladuvat squirrel.");
        }
    }

}

