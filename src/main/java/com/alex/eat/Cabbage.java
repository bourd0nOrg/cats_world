package com.alex.eat;

public class Cabbage implements Weigh {
    private int weight;
    private String color;

    public Cabbage(int weight, String color) {
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
        return "Cabbage{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}

