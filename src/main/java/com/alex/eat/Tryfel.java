package com.alex.eat;


public class Tryfel implements Weigh {
    private int weight;
    private int price;
    private String breed;

    public Tryfel(int weight, int price, String breed) {
        this.weight = weight;
        this.price = price;
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Tryfel{" +
                "weight=" + weight +
                ", price=" + price +
                ", breed='" + breed + '\'' +
                '}';
    }
}