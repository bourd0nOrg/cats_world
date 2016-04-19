package com.alex.pets;

public class Pet implements Alive {

    public boolean isAlive;

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
