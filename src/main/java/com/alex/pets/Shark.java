package com.alex.pets;

public class Shark extends Fish {

    public Shark() {
        super("shark");
    }

    public void eat(Object object) {
        System.out.println("Shark eat " + object.toString());

        if (object instanceof Bunny || object instanceof Cat || object instanceof Raccoon) {
            Pet pet = (Pet) object;
            if (pet.isAlive()) {
                pet.kill();

            } else {
                System.out.println("!!! I eat only alive pets !!!");

            }
        } else {
            System.out.println("!!! I don't want eat this !!!");

        }
    }
}


