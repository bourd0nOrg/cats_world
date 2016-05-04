package com.alex.eat;

/**
 * Created by Студент on 04.05.2016.
 */
public class Meat {
    private Meat[] meats;
    private int index;
    private  int size;

    public class PitMeatArray(int size){
        this.meats = new Meat[size];
        this.size = size;
        this.index = 0;

    }

    public void addMeat(Meat meat) {
        if (index < size) {
            this.meats[index] = meat;
            index = index + 1;
        } else {
            System.out.println("Pit is full");
        }
    }

    public Meat getMeat() {
        if (index >= 0) {
            Meat meat = meats[index];
            index = index - 1;
            return meat;
        } else {
            throw new IllegalStateException("No meat in pit");
        }
    }

    public Meat[] getAllMeats() {
        return meats;
    }
}