package com.alex.main;


import com.alex.pets.Cat;
import com.alex.pets.Fish;
import com.alex.pets.Pig;
import com.alex.pets.Shark;

public class MainClass {

    public static void main(String[] args) {
        Cat pushok = new Cat("Pushok", "Pers");
        Fish ocun = new Fish("ocun");
        Pig hryusha = new Pig("hryusha", "kaban");
        pushok.eat(ocun);

        Fish karas = new Fish("karas");
        pushok.eat(karas);
        hryusha.swimming();
        hryusha.zhratb();
        hryusha.hryukat();
        Shark shark = new Shark();
        shark.eat(pushok);

        pushok.sleep();

        pushok.play();
    }
}
