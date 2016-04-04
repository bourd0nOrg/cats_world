package com.alex.pets;

public class Shark extends Fish {

    public Shark() {
        super("shark");
    }

    public void eat(Object object) {
        System.out.println("Shark eat " + object.toString());

        if (object instanceof Cat) {
            Cat cat = (Cat) object;
            if (cat.isAlive()) {
                cat.kill();
            } else {
                System.out.println("!!! I eat only alive cats !!!");
            }
        }
    }
}
