package com.alex.eat;

public class TryfelBasketArray implements Weigh {
    private Tryfel[] tryfels;
    private int index;
    private int size;

    public TryfelBasketArray(int size) {
        this.tryfels = new Tryfel[size];
        this.index = -1;
        this.size = size;
    }

    public void addTryfel(Tryfel tryfel) {
        if (index < size - 1) {
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

    public int getCurrentSize() {
        return index + 1;
    }

    @Override
    public int getWeight() {
        int sum = 0;
    /*    for (int i = 0; i < tryfels.length; i++) {
            Tryfel currenttryfel = tryfels[i];
            if (currenttryfel != null) {
                sum = sum + currenttryfel.getWeight();

            }
            return sum;
        }
        for (int i = 0; i < getCurrentSize(); i++) {
            sum = sum + tryfels[i].getWeight();
        }
        return sum;
    }*/
        for (Tryfel tryfel : tryfels) {
            if (tryfel != null) {
                sum = sum + tryfel.getWeight();
            }
        }
        return sum;
    }
}