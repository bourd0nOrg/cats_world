package com.alex.pets;

import com.alex.eda.Ikra;

public class Fish extends Pet implements Alive {

    protected String breed;
    private String metatIkra;

    public Fish(String shark) {
        super();
        this.breed = breed;
        this.metatIkra = metatIkra;
    }

    public String getBreed() {
        return breed;
    }

    public void eat(Object object) {
        if (object instanceof Cat) {
            System.out.println("!!! Fish " + breed + " can't eat cat");

                Cat cat = (Cat) object;
                if (cat.isAlive()) {
                    cat.kill();
                } else {
                    System.out.println("Fish " + breed + " eat " + object.toString());
                }


        }
    }
    public void metatIkra(Object object){
        if (object instanceof Ikra) {
            System.out.println("Fish otlozila ikru");
            Ikra ikra = (Ikra) object;
            if (ikra.isEst()) {
                ikra.netu();
            } else {
                System.out.println("Ikri net");
            }
        }

    }
}
