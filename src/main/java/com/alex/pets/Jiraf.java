package com.alex.pets;

import com.alex.plants.Tree;

public class Jiraf extends Pet implements Alive {
    private String name;
    private Integer length;

    public Jiraf(String someName, Integer length) {
        this.name = someName;
        this.length = length;
    }

    public void eat(Tree tree) {
        if (isAlive) {
            System.out.println("Jiraf " + name + " eat " + tree.getBreed());
        } else {
            System.out.println("Jiraf is dead.");
        }
    }

    public String getName() {
        return name;
    }

    public Integer getLength() {
        return length;
    }
}
