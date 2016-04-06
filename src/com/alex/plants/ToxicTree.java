package com.alex.plants;

import com.alex.pets.Jiraf;

public class ToxicTree extends Tree{


    public ToxicTree() {
        super("toxic tree");
    }

    public void poisoning(Object object){
        System.out.println("Toxic tree poisoned " + object.toString());

        if (object instanceof Jiraf){
            Jiraf jiraf = (Jiraf) object;
            if (jiraf.isAlive()){
                jiraf.kill();
            } else {
                System.out.println("The dead do not eat");
            }
        }
    }
}
