package com.alex.eat;


public class CarrotBasketArray implements Weigh {
    private Carrot[] carrots;
    private int index;
    private int size;


    public CarrotBasketArray(int size) {
        this.carrots = new Carrot[size];
        this.size = size;
        this.index = -1;

    }

    public void addCarrot(Carrot carrot) {
        if (index < size - 1) {
            index = index + 1;
            this.carrots[index] = carrot;
        } else {
            System.out.println("Sorry basket is full!");
        }
    }

    public Carrot getCarrot() {
        if (index >= 0) {
            Carrot carrot = carrots[index];
            index = index - 1;
            return carrot;
        } else {
            throw new IllegalStateException("Sorry the basket is empty :C");
        }
    }

    public Carrot[] getAllCarrots() {
        return carrots;
    }

    public int getCurrentSize() {
        return index + 1;
    }

    @Override
    public int getWeight() {
        int sum = 0;
        /* //1 vsriant
           for (int i = 0; i < carrots.length; i++) {
            Carrot currentCarrot = carrots[i];
            if (currentCarrot != null) {
                sum = sum + currentCarrot.getWeight(); */
      /* //2 varia
       for (int i = 0; i < getCurrentSize; i++) {
                     sum = sum + carrots[i].getWeight();
            }
        }*/
        for (Carrot carrot : carrots) {
            if (carrot != null) {
                sum = sum + carrot.getWeight();
            }
        }
        return sum;
    }
}
