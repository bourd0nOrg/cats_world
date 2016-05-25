package com.alex.eat;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CarrotBasketCollection implements Weigh {

    private Set<Carrot> carrots;
    private int size;

    public CarrotBasketCollection(int size) {
        this.carrots = new HashSet<>(size);
        this.size = size;
    }

    public void addCarrot(Carrot carrot) {
        if (carrots.size()<size){
            carrots.add(carrot);
        }else {
            System.out.print("Sorry basket is Full!");
        }

    }

    public Carrot getCarrot() {
        Iterator<Carrot> iterator = carrots.iterator();
        if (iterator.hasNext()) {
            Carrot nextCarrot = iterator.next();
            carrots.remove(nextCarrot);
            return nextCarrot;
        } else {
            throw new IllegalStateException("Sorry basket is full!");
        }
    }

    public Set<Carrot> getAllCarrots() {
        return Collections.unmodifiableSet(carrots);
    }

    public int getCurrentSize() {
        return carrots.size();
    }

    @Override
    public int getWeight() {
       /* int sum = 0;
        for (Carrot carrot : carrots) {
            if (carrot != null) {
                sum = sum + carrot.getWeight();
            }
        }
        //4 var
        //carrots.stream().mapToInt(carrot -> carrot.getWeight()).sum(); =
        */return carrots.stream().mapToInt(Carrot::getWeight).sum();
   }
}


