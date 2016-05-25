package com.alex.eat;

public class BasketEggsArray implements Weigh {
    private Eggs[] eggses;
    private int index;
    private int size;

    public BasketEggsArray(int size) {
        this.eggses = new Eggs[size];
        this.size = size;
        this.index = -1;
    }


    public void addEggs(Eggs eggs) {
        if (index < size - 1) {
            index = index + 1;
            this.eggses[index] = eggs;
        } else {
            System.out.println("Sorry basket is full!");
        }
    }

    public Eggs getEggs() {
        if (index >= 0) {
            Eggs eggs = eggses[index];
            index = index - 1;
            return eggs;
        } else {
            throw new IllegalStateException("Sorry, no eggses in basket!");
        }
    }

    @Override
    public int getWeight() {
        int sum = 0;
        //1variant
//        for (int i = 0; i < eggses.length; i++) {
//            Eggs currentEggs = eggses[i];
//            if (currentEggs != null) {
//                sum = sum + eggses[i].getWeight();
//            }
//   }
        //2 variant
//        for (int i = 0; i < getCurrentSize(); i++) {
//            sum = sum + eggses[i].getWeight();
//        }
        //3 variant
        for (Eggs eggs : eggses) {
            if (eggs != null) {
                sum = sum + eggs.getWeight();
            }
        }
        return sum;
    }

    public Eggs[] getEggses() {
        return eggses;
    }

    public int getCurrentSize() {
        return index + 1;
    }
}
