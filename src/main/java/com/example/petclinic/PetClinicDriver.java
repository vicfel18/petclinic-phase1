package com.example.petclinic;

import com.example.petclinic.controller.OwnerController;
import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Pet;
import com.example.petclinic.model.PetType;
import com.example.petclinic.repository.OwnerRepository;
import com.example.petclinic.service.OwnerService;

import java.util.Date;
import java.util.List;


public class PetClinicDriver {

    public static void main(String[] args) {

        // Owner dependency injection (DI) setup
        OwnerRepository ownerRepository = new OwnerRepository();
        OwnerService ownerService = new OwnerService(ownerRepository);
        OwnerController ownerController = new OwnerController(ownerService);

        // TODO add other 3-tier DI setups here

        // ***** Owner testing *****

        // create our owners
        Owner owner1 = new Owner(1, "Homer Simpson", "742 Evergreen Terrace", "Springfield", "9395550113");
        Owner owner2 = new Owner(2, "Marge Simpson", "742 Evergreen Terrace", "Springfield", "9395550113");
        Owner owner3 = new Owner(3, "Lisa Simpson", "742 Evergreen Terrace", "Springfield", "9395550113");
        Owner owner4 = new Owner(4, "Bart Simpson", "742 Evergreen Terrace", "Springfield", "9395550113");

        // save owners to database
        ownerController.saveOwner(owner1);
        ownerController.saveOwner(owner2);
        ownerController.saveOwner(owner3);
        ownerController.saveOwner(owner4);

        // get all owners from database and display them
        List<Owner> owners = ownerController.getAllOwners();
        display(owners);

        // create some pets and add them to an existing owner
        Pet pet1 = new Pet(1, "Godzilla", new Date(), PetType.LIZARD);
        Pet pet2 = new Pet(2, "Santa's Little Helper", new Date(), PetType.DOG);
        owner4.addPet(pet1);
        owner4.addPet(pet2);

        // display the owner info again
        display(owners);

        // TODO add other tests for other models here
    }

    /**
     * Convenience method to display results
     *
     * @param obj
     */
    private static void display(Object obj) {

        if (obj instanceof List) {

            List<?> list = (List) obj;
            for (Object o : list) {
                System.out.println("\t" + o);
            }

        } else {

            System.out.println(obj);

        }

        System.out.println();
    }
}
