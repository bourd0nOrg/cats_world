package com.alex.pets;



public class Pet implements Alive {

    protected String breed;

    public Pet(String breed) {
        super();
        this.breed = breed;
    }

    protected boolean isAlive;

    public Pet() {
        this.isAlive = true;
    }



    public void kill() {
        this.isAlive = false;
    }

    public boolean isAlive() {
        return isAlive;
    }

}
