package com.example.petclinic.service;

import com.example.petclinic.model.Pet;
import com.example.petclinic.repository.PetRepository;

import java.util.List;

public class PetService implements BasicService<Pet>{

    private PetRepository petRepository;

    public PetService(PetRepository petRepository){
        this.petRepository = petRepository;
    }

    public Pet add(Pet pet){
        return this.petRepository.create(pet);
    }

    public Pet get(Long id) { return this.petRepository.read(new Pet(id)); }

    public Pet modify(Pet owner) {

        return this.petRepository.update(owner);
    }

    public boolean delete(Pet owner) {

        return this.petRepository.delete(owner);
    }

    public List<Pet> getAll() {

        return petRepository.getAll();
    }
}
