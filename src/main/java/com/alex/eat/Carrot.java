package com.alex.eat;

public class Carrot implements Weigh{

    private int weight;
    private String color;

    public Carrot(int weight, String color) {

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
        return "Carrot{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
