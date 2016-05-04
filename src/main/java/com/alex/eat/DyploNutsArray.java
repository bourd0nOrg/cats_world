package com.alex.eat;

public class DyploNutsArray {
    private Nut[] nuts;
    private int index;
    private int size;

    public DyploNutsArray(int size) {
        this.nuts = new Nut[size];
        this.size = size;
        this.index = -1;
    }

    public void addNut(Nut nut) {
        if (index < size - 1) {
            index = index + 1;
            this.nuts[index] = nut;
        } else {
            System.out.println("Sorry dyplo is full!");
        }
    }

    public Nut getNut() {
        if (index >= 0) {
            Nut nut = nuts[index];
            index = index - 1;
            return nut;
        } else {
            throw new IllegalStateException("Sorry , no nut in dyplo");
        }
    }
    public Nuts[] getAllNuts(){
        return  nuts;
    }
}

