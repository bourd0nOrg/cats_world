package com.alex.main;


import com.alex.pets.*;
import com.alex.plants.Grass;

import java.util.concurrent.atomic.AtomicReference;

public class MainClass {

    public static void main(String[] args) {
        Cat pushok = new Cat("Pushok", "Pers");
        Fish ocun = new Fish("ocun");
        Pig hryusha = new Pig("hryusha", "kaban");
        Cow aurora = new Cow("Aurora", "Alpine");
        pushok.eat(ocun);


        Dragon paarthurnax = new Dragon("Paarthurnax", "Fire");
        Sheep dolly = new Sheep("Dolly");

        paarthurnax.eat(dolly);
        paarthurnax.fly();


        Fish karas = new Fish("karas");

        pushok.eat(karas);
        hryusha.swimming();
        hryusha.zhratb();
        hryusha.hryukat();
        Shark shark = new Shark();
        shark.eat(pushok);

        pushok.sleep();

        pushok.play();

        aurora.moo();

        aurora.pasture();

        aurora.eat();
    }
}
