package com.alex.pets;


import com.alex.exceptions.PetIsDeadException;

public class Dragon extends Pet implements Alive {
    private String name;
    private String breath;

    public Dragon(String someName, String breath) {
        this.name = someName;
        this.breath = breath;
    }

    public void fly() {

        if (!isAlive())
            throw new PetIsDeadException(this);
        System.out.println("Dragon " + name + " is flying");


    }

    public void eat(Sheep sheep) {
        if (!isAlive())
            throw new PetIsDeadException(this);

            sheep.kill();
            System.out.println("Dragon " + name + " eat " + Sheep.getName());
    }

    public void kill (Object object) {
        if (object instanceof Bear) {
            Bear bear = (Bear) object;
            if (bear.isAlive()) {
                bear.kill();
            } else {
                System.out.println("Bears never die!!!");
            }

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
