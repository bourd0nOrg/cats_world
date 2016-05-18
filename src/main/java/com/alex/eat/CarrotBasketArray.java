package com.alex.eat;


public class CarrotBasketArray {
    private Carrot[] carrots;
    private int index;
    private int size;


    public CarrotBasketArray(int size) {
        this.carrots = new Carrot[size];
        this.size  = size;
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

    public Carrot getCarrot () {
        if (index >= 0){
            Carrot carrot = carrots[index];
            index = index - 1;
            return carrot;
        } else {
            throw new IllegalStateException("Sorry the basket is empty T_T");
        }
    }

    public Carrot[] getAllCarrots(){
        return carrots;
    }

    public int getCurrentSize (){
        return index + 1;
    }
}
