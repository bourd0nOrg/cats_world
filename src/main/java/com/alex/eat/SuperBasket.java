package com.alex.eat;


import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SuperBasket<E extends Weigh> implements Weigh {

    private Set<E> elements;

    public SuperBasket(int size) {
        this.elements = new HashSet<>(size);
    }

    public SuperBasket() {
        this.elements = new HashSet<>();
    }

    public void addElement(E element) {
        elements.add(element);
    }

    public E getElement() {
        Iterator<E> iterator = elements.iterator();
        if (iterator.hasNext()) {
            E nextElem = iterator.next();
            elements.remove(nextElem);
            return nextElem;
        } else {
            throw new IllegalStateException("Sorry, no elements in basket!");
        }
    }

    public Set<E> getAllElements() {
        return Collections.unmodifiableSet(elements);
    }

    public int getCurrentSize() {
        return elements.size();
    }

    @Override
    public int getWeight() {
        int sum = 0;
        //3 variant
/*        for (E element : elements) {
            if (element != null) {
                sum = sum + element.getWeight();
            }
        }*/
        //4 variant
        sum = elements.stream().mapToInt(E::getWeight).sum();
        return sum;
    }
}
