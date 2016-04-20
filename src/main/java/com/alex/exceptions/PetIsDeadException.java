package com.alex.exceptions;

import com.alex.pets.Pet;

public class PetIsDeadException extends RuntimeException {

    private Pet pet;

    public PetIsDeadException(Pet pet) {
        super("Pet is dead!. Pet " + pet);
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
}
