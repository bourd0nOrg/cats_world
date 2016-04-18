package com.alex.Eating;


public class Food implements Wet{

    protected boolean wet;

    public Food() {
        this.wet = true;
    }


    public void dry() {
        this.wet = false;
    }

    public boolean wet() {
        return wet;
    }
}
