package com.alex.pets;

public class Shark extends Fish {

    public Shark() {
        super("shark");
    }

    public void eat(Object object) {
        System.out.println("Shark eat " + object.toString());

        if (object instanceof Bunny) {
            Bunny bunny = (Bunny) object;
            if (bunny.isAlive()) {
                bunny.kill();
            } else {
                System.out.println("!!! I eat only alive bunny !!!");
            }
        }
        if (object instanceof Raccoon) {
            Raccoon raccoon = (Raccoon) object;
            if (raccoon.isAlive()){
                raccoon.kill();
            }else {
                System.out.println("!!! I eat only alive raccoon !!!");
            }
        }
    }

}
