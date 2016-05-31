package com.alex.eat;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EggsBasketCollection implements Weigh {
    private Set<Eggs> eggses;
    private int size;

    public EggsBasketCollection(int size) {
        this.eggses = new HashSet<>(size);
        this.size = size;
    }


    public void addEggs(Eggs eggs) {
        if (eggses.size() < size) {
            eggses.add(eggs);
        } else {
            System.out.println("Sorry basket is full!");
        }
    }

    public Eggs getEggs() {
        Iterator<Eggs> iterator = eggses.iterator();
        if (iterator.hasNext()) {
            Eggs nextEggs = iterator.next();
            eggses.remove(nextEggs);
            return nextEggs;
        } else {
            throw new IllegalStateException("Sorry, no eggses in basket!");
        }
    }

    public Set<Eggs> getAllEggses() {
        return Collections.unmodifiableSet(eggses);
    }

    public int getCurrentSize() {
        return eggses.size();
    }

    @Override
    public int getWeight() {
//        int sum = 0;
        //3 variant
//        for (Eggs eggs : eggses) {
//            if (eggs != null) {
//                sum = sum + eggs.getWeight();
//            }
//        }
        //4 variant
        // eggses.stream().mapToInt(eggs -> eggs.getWeight()).sum();
        return eggses.stream().mapToInt(Eggs::getWeight).sum();
//        return sum;
    }

    public Set<Eggs> getAllEggs() {
        return eggses;
    }
}


