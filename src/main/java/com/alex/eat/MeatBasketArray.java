package com.alex.eat;

/**
 * Created by Студент on 25.05.2016.
 */
public class MeatBasketArray {
    private Meat[] meats;
    private int index;
    private int size;

    public MeatBasketArray(int size) {
        this.meats = new Meat[size];
        this.size = size;
        this.index = -1;
    }

    public void addMeat(Meat meat) {
        if (index < size - 1) {
            index = index + 1;
            this.meats[index] = meat;
        } else {
            System.out.println("Sorry basket is full!");
        }
    }

    public Meat getMeat() {
        if (index >= 0) {
            Meat meat = meats[index];
            index = index - 1;
            return meat;
        } else {
            throw new IllegalStateException("Sorry, no meats in basket!");
        }
    }

    public Meat[] getAllMeats() {
        return meats;
    }

    public int getCurrentSize() {
        return index + 1;
    }

    @Override
    public int getWeight() {
        int sum = 0;
        for (int i = 0; i < meats.length; i++) {
            Meat currentMeat = meats[i];
            if (currentMeat != null) {
                sum = sum + meats[i].getWeight();
            }
        }
        for (int i = 0; i < getCurrentSize(); i++) {
            sum = sum + meats[i].getWeight();
        }
        for (Meat meat : meats) {
            if (meat != null) {
                sum = sum + meat.getWeight();
            }
            return sum;
        }
    }
}