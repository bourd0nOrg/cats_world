package com.alex.Eating;


public class Lapa extends Food implements Wet {

    private String size;
    private String name;

    public Lapa(String someName, String size) {
        this.size = size;
        this.name = someName;

    }
}