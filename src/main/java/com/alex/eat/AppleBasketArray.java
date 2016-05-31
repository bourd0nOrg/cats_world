package com.alex.eat;

public class AppleBasketArray implements Weigh {

    private Apple[] apples;
    private int index;
    private int size;

    public AppleBasketArray(int size) {
        this.apples = new Apple[size];
        this.size = size;
        this.index = -1;
    }

    public void addApple(Apple apple) {
        if (index < size - 1) {
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

    public int getCurrentSize() {
        return index + 1;
    }

    @Override
    public int getWeight() {
        int sum = 0;
        //1 variant
        /*for (int i = 0; i < apples.length; i++) {
            Apple currentApple = apples[i];
            if (currentApple != null) {
                sum = sum + currentApple.getWeight();
            }
        }*/
        //2 variant
        /*for (int i = 0; i < getCurrentSize(); i++) {
            sum = sum + apples[i].getWeight();
        }*/
        //3 variant
        for (Apple apple : apples) {
            if (apple != null) {
                sum = sum + apple.getWeight();
            }
        }
        return sum;
    }
}
