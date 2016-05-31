package com.alex.eat;

public class DyploNutsArray implements Weigh {
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

    public Nut[] getAllNuts() {
        return nuts;
    }

    public int getCurrentSize() {
        return index + 1;
    }

    @Override
    public int getWeight() {
        int sum = 0;
//        for (int i = 0; i < nuts.length; i++) {
//            Nut currentNut = nuts[i];
//            if (currentNut != null) {
//                sum = sum + nuts[i].getWeight();
//            }
//        }
//        for (int i = 0; i < getCurrentSize(); i++) {
//            sum = sum + nuts[i].getWeight();
//        }

        for (Nut nut : nuts) {
            if (nut != null) {
                sum = sum + nut.getWeight();
            }
        }
        return sum;


    }
}

