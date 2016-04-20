package com.alex.eda;

import com.alex.pets.Fish;

/**
 * Created by Студент on 20.04.2016.
 */
public class Ikra extends Eda implements Est  {
    protected String metatIkra;

    public Ikra(String metatIkra) {
        super();
        this.metatIkra = metatIkra;
    }

    public String getMetatIkra() {
        return metatIkra;
    }

    public void setMetatIkra(Object object) {
        if (object instanceof Fish) {
            System.out.println("Fish otlozila ikru");
        } else {
            System.out.println("Ikri net");
        }
    }
}
    