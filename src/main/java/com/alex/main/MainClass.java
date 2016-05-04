package com.alex.main;

        import com.alex.pets.Cat;
        import com.alex.pets.Fish;
        import com.alex.pets.Shark;

import com.alex.eat.Lapa;
        import com.alex.pets.Raccoon;
        import com.alex.pets.*;
import com.alex.pets.Bear;
import com.alex.plants.Clover;
import com.alex.plants.Grass;



public class MainClass {

    public static void main(String[] args) {
        Cat pushok = new Cat("Pushok", "Pers");
        Fish ocun = new Fish("ocun");
        Lapa lapa = new Lapa("lapa", "53");

        Raccoon froska = new Raccoon("Froska", "Barbados");
        pushok.eat(ocun);
        froska.play();
        froska.rinsing();
        froska.steal();

        Bear kopatych = new Bear("Kopatych", "Grizli", "brown");

        Pig hryusha = new Pig("hryusha", "kaban");
        Cow aurora = new Cow("Aurora", "Alpine");
        Pantera pantera = new Pantera ("Terapan", "Black", "Black");
        pushok.eat(ocun);
        Bunny pitch = new Bunny("Pitch", "Shinshilla", "Gray");
        Dragon paarthurnax = new Dragon("Paarthurnax", "Fire");
        Sheep dolly = new Sheep("Dolly");
        paarthurnax.eat(dolly);
        paarthurnax.fly();
        pitch.hide();
        pitch.eat(new Clover("Grass"));

        Wolf sif = new Wolf("Sif","Demon");

        sif.lovit(pushok);
        sif.eat(hryusha);

        Fish karas = new Fish("karas");

        pushok.eat(karas);

        hryusha.swimming();
        hryusha.zhratb();
        hryusha.hryukat();

        Shark shark = new Shark();
        shark.eat(froska);
        kopatych.grblzt(lapa);

        froska.play();
        pushok.sleep();

        pushok.play();
        Grass grass = new Grass("grass");
        aurora.pasture();
        aurora.eat(grass);
        aurora.moo();
        pantera.eat(aurora);
        shark.eat(pushok);
    }
}
