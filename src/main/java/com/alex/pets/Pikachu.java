package com.alex.pets;

import com.alex.exceptions.PetIsDeadException;

public class Pikachu extends Pet implements Alive{
    private String name;
    private String breed;
    public Pikachu(String someName, String breed) {
        this.name = someName;
        this.breed = breed;
    }
    public void jump() {
        if (!isAlive())
            throw new PetIsDeadException(this);
        System.out.println("Pikachu " + name + " is jumping");
    }
    public void lightning () {
        if (!isAlive())
            throw new PetIsDeadException(this);
        System.out.println("Pikachu " + name + " lightning");
    }
    public String getName() {
        return name;
    }
    public String getBreath() {
        return breed;
    }
    public String toString() {
        return "Pikachu " + name;
    }}
