package com.alex.eat;

public class AppleBasketArray {

    private Apple[] apples;
    private int index;
    private int size;

    public AppleBasketArray(int size) {
        this.apples = new Apple[size];
        this.size = size;
        this.index = -1;
    }

    public void addApple(Apple apple) {
        if (index < size - 1 ) {
            index = index + 1;
            this.apples[index] = apple;
        } else {
            System.out.println("Sorry basket is full!");
        }
    }

    public Apple getApple() {
        if (index >= 0) {
            Apple apple = apples[index];
            index = index - 1;
            return apple;
        } else {
           throw new IllegalStateException("Sorry, no apples in basket!");
        }
    }

    public Apple[] getAllApples() {
        return apples;
    }
}
