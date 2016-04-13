package com.alex.plants;

import com.alex.pets.Jiraf;

public class Tree {

    protected String breed;

    public Tree(String breed) {
        super();
        this.breed = breed;
    }

    public  String getBreed() { return  breed; }

    public void poisoning(Object object){
        if(object instanceof Jiraf){
            System.out.println("Tree " + breed + "poisoned jiraf");
        }else {
            System.out.println(object.toString() + "don't eat tree.");
        }
    }

}
