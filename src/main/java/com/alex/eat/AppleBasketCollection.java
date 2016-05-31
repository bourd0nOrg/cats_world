package com.alex.eat;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AppleBasketCollection implements Weigh {

    private Set<Apple> apples;
    private int size;

    public AppleBasketCollection(int size) {
        this.apples = new HashSet<>(size);
        this.size = size;
    }

    public void addApple(Apple apple) {
        if (apples.size() < size) {
            apples.add(apple);
        } else {
            System.out.println("Sorry basket is full!");
        }
    }

    public Apple getApple() {
        Iterator<Apple> iterator = apples.iterator();
        if (iterator.hasNext()) {
            Apple nextApple = iterator.next();
            apples.remove(nextApple);
            return nextApple;
        } else {
            throw new IllegalStateException("Sorry, no apples in basket!");
        }
    }

    public Set<Apple> getAllApples() {
        return Collections.unmodifiableSet(apples);
    }

    public int getCurrentSize() {
        return apples.size();
    }

    @Override
    public int getWeight() {
/*        int sum = 0;
        //3 variant
        for (Apple apple : apples) {
            if (apple != null) {
                sum = sum + apple.getWeight();
            }
        }*/
        //4 variant
        return apples.stream().mapToInt(apple -> apple.getWeight()).sum();
    }
}
