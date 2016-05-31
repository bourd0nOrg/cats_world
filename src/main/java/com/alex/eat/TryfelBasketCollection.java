package com.alex.eat;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TryfelBasketCollection implements Weigh {
    private Set<Tryfel> tryfels;
    private int size;

    public TryfelBasketCollection(int size) {
        this.tryfels = new HashSet<>(size);
        this.size = size;
    }



    public void addTryfel(Tryfel tryfel) {
        if(tryfels.size()<size) {
            tryfels.add(tryfel);

        } else {
            System.out.println("Sorry, basket is full");
        }
    }

    public Tryfel getTryfel() {
        Iterator<Tryfel> iterator = tryfels.iterator();
        if (iterator.hasNext()) {
            Tryfel nextTryfel = iterator.next();
            tryfels.remove(nextTryfel);
            return nextTryfel;
        } else {
            throw new IllegalStateException("Sorry, no tryfels in basket");
        }
    }


    public Set<Tryfel> getAllTryfels() {
        return Collections.unmodifiableSet(tryfels);
    }

    public int getCurrentSize() {
        return tryfels.size();
    }

    @Override
    public int getWeight() {
      int sum = 0;

    /*    for (Tryfel tryfel : tryfels) {
            if (tryfel != null) {
                sum = sum + tryfel.getWeight();
            }
        }*/
       return tryfels.stream().mapToInt(tryfel -> tryfel.getWeight()).sum();
    }
}

