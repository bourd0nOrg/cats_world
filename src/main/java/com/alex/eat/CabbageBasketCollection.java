package com.alex.eat;

import java.util.*;

public class CabbageBasketCollection implements Weigh {
    private Set<Cabbage> cabbages;
    private int size;

    public CabbageBasketCollection(int size) {
        this.cabbages = new HashSet<>(size);
        this.size = size;
    }

    public void addCabbage(Cabbage cabbage) {
        if (cabbages.size() < size){
            cabbages.add(cabbage);
        }else{
            System.out.println("Sorry basket is full");
        }
    }

    public Cabbage getCabbage() {
        Iterator<Cabbage> iterator = cabbages.iterator();
        if (iterator.hasNext()) {
            Cabbage nextCabbage = iterator.next();
            cabbages.remove(nextCabbage);
            return nextCabbage;
        } else {
            throw new IllegalStateException("Sorry, no cabbages in basket!");
        }
    }

    public Set<Cabbage> getCabbages() {
        return Collections.unmodifiableSet(cabbages);
    }

    public int getCurrentSize() {
        return cabbages.size();
    }

    @Override
    public int getWeight() {
        //int sum = 0;
        //3 variant
        /*for (Cabbage cabbage : cabbages) {
            if (cabbage != null) {
                sum = sum + cabbage.getWeight();
            }
        }*/

//4 variant
        return cabbages.stream().mapToInt(cabbage -> cabbage.getWeight()).sum();

    }
}