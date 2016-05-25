package com.alex.eat;


import java.util.*;

public class DyploNutsCollection implements Weigh {
    private Set<Nut> nuts;
    private int size;

    public DyploNutsCollection(int size) {
        this.nuts = new HashSet<>(size);
        this.size = size;
    }


    public void addNut(Nut nut) {
        if (nuts.size() < size) {
            nuts.add(nut);
        } else {
            System.out.println("Sorry dyplo is full");
        }
    }

    public Nut getNut() {
        Iterator<Nut> iterator = nuts.iterator();
        if (iterator.hasNext()) {
            Nut nextNut = iterator.next();
            nuts.remove(nextNut);
            return nextNut;
        } else {
            throw new IllegalStateException("Sorry , no nut in dyplo");
        }
    }

    public Set<Nut> getAllNuts() {
        return Collections.unmodifiableSet(nuts);
    }

    public int getCurrentSize() {

        return nuts.size();
    }

    @Override
    public int getWeight() {
//        int sum = 0;
//        for (int i = 0; i < nuts.length; i++) {
//            Nut currentNut = nuts[i];
//            if (currentNut != null) {
//                sum = sum + nuts[i].getWeight();
//            }
//        }
//        for (int i = 0; i < getCurrentSize(); i++) {
//            sum = sum + nuts[i].getWeight();
//        }

//        for (Nut nut : nuts) {
//            if (nut != null) {
//                sum = sum + nut.getWeight();
//            }
//        }
        return nuts.stream().mapToInt(nuts -> nuts.getWeight()).sum();
    }

}

