package com.example.petclinic.service;
import com.example.petclinic.utility.Validator;

import com.example.petclinic.model.Owner;
import com.example.petclinic.repository.OwnerRepository;

import java.util.List;

public class OwnerService implements BasicService<Owner> {

    private OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {

        this.ownerRepository = ownerRepository;
    }

    public Owner add(Owner owner) throws IllegalArgumentException {
        if(!Validator.phoneValidation(owner.getPhoneNumber())){
            throw new IllegalArgumentException();
        }

        return this.ownerRepository.create(owner);
    }

    public Owner get(Long id) {

        return this.ownerRepository.read(new Owner(id));
    }

    public Owner modify(Owner owner) {
        if(!Validator.phoneValidation(owner.getPhoneNumber())){
            throw new IllegalArgumentException();
        }

        return this.ownerRepository.update(owner);
    }

    public boolean delete(Owner owner) {

        return this.ownerRepository.delete(owner);
    }

    public List<Owner> getAll() {

        return ownerRepository.getAll();
    }


}
