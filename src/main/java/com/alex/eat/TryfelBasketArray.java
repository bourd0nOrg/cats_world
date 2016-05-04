package com.alex.eat;

public class TryfelBasketArray {
    private Tryfel[] tryfels;
    private int index;
    private int size;

    public TryfelBasketArray(int size) {
        this.tryfels = new Tryfel[size];
        this.index = -1;
        this.size = size;
    }

    public void addTryfel(Tryfel tryfel) {
        if (index <= size - 1) {
            index = index + 1;
            this.tryfels[index] = tryfel;
        } else {
            System.out.println("TryfelBasket is full!");
        }
    }

    public Tryfel getTryfel() {
        if (index >= 0) {
            Tryfel tryfel = tryfels[index];
            index = index - 1;
            return tryfel;
        } else {
            throw new IllegalStateException("Sorry, no tryfels in basket");
        }
    }

    public Tryfel[] getAllTryfels() {
        return tryfels;
    }
}
