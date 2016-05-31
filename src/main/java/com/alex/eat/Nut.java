package com.alex.eat;

public class Nut implements Weigh {

    private int weight;
    private String kind;

    public Nut(int weight,  String kind) {
        this.weight = weight;
        this.kind = kind;


    }

    public int getWeight() {
        return weight;
    }

    public String getKind() { return kind; }

    @Override
    public String toString() {
        return "Nut{" +
                "weight=" + weight +
                ", kind='" + kind + '\'' +
                '}';
    }
}
