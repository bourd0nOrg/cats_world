package com.alex.pets;

/**
 * Created by User on 05.04.2016.
 */
public class Dragon extends Pet implements Alive {
    private String name;
    private String breath;

    public Dragon(String someName, String breath) {
        this.name = someName;
        this.breath = breath;
    }

    public void fly() {
        if (isAlive) {
            System.out.println("Dragon " + name + " is flying");
        } else {
            System.out.println("Dragon " + name + " killed by Dovahkiin");
        }
    }

    public void eat(Sheep sheep) {
        if (isAlive) {
            System.out.println("Dragon " + name + " eat " + Sheep.getName());
        } else {
            System.out.println("Dragon " + name + " is hungry(pls feed me :C)");
        }
    }

    public String getName() {
        return name;
    }

    public String getBreath() {
        return breath;
    }

    public String toString() {
        return "Dragon " + name;
    }
}
