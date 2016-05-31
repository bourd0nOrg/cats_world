package com.alex.eat;


public class Eggs  implements Weigh{
    private int weight;
    private String color;
    private String breed;

    public Eggs(int weight, String color, String breed) {

        this.weight = weight;
        this.color = color;
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Eggs{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}