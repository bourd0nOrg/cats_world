
package com.alex.eat;



public class Lapa implements Wet {

    private String size;
    private String name;
    public boolean wet;

    public Lapa(String someName, String size) {
        this.size = size;
        this.name = someName;
        this.wet = false;

    }

    @Override
    public void dry() {
        this.wet = false;
    }

    @Override
    public void namochit() {
        this.wet = true;
    }

    @Override
    public boolean isWet() {
        return wet;
    }
}