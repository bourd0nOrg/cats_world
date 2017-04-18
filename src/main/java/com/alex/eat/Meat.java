package com.alex.eat;

/**
 * Created by Студент on 04.05.2016.
 */
public class Meat implements Weigh {
    private int weight;
    private String color;

    public Meat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}