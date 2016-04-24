package com.alex.pets;


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
