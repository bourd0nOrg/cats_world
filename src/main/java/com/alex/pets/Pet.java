package com.alex.pets;

public class Pet implements Alive {

    protected boolean isAlive;
    private boolean isPoisoned;
    private boolean poison;

    public Pet() {
        this.isAlive = true;
        this.poison = false;
    }

    public void kill() {
        this.isAlive = false;
    }

    public void poison() {
        this.poison = true;
    }

    public void heal() {
        this.poison = false;
    }

    public boolean isAlive() {
        return isAlive;
    }


    public boolean isPoisoned() {
        return poison;
    }
}
