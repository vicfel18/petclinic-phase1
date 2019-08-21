package com.example.petclinic;

import com.example.petclinic.controller.OwnerController;
import com.example.petclinic.controller.PetController;
import com.example.petclinic.controller.VetController;
import com.example.petclinic.controller.VisitController;
import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Pet;
import com.example.petclinic.model.Vet;
import com.example.petclinic.model.Visit;
import com.example.petclinic.repository.OwnerRepository;
import com.example.petclinic.repository.PetRepository;
import com.example.petclinic.repository.VetRepository;
import com.example.petclinic.repository.VisitRepository;
import com.example.petclinic.service.OwnerService;
import com.example.petclinic.service.PetService;
import com.example.petclinic.service.VetService;
import com.example.petclinic.service.VisitService;

import java.util.List;


public class PetClinicDriver {

    public static void main(String[] args) {

        testApp();

    }

    private static void testApp() {

        // Owner 3-Tier setup using manual dependency injection (DI)
        OwnerRepository ownerRepository = new OwnerRepository();
        OwnerService ownerService = new OwnerService(ownerRepository);
        OwnerController ownerController = new OwnerController(ownerService);

        // Pet 3-Tier setup using manual dependency injection (DI)
        PetRepository petRepository = new PetRepository();
        PetService petService = new PetService(petRepository);
        PetController petController = new PetController(petService);

        // Visit 3-Tier setup using manual dependency injection (DI)
        VisitRepository visitRepository = new VisitRepository();
        VisitService visitService = new VisitService(visitRepository);
        VisitController visitController = new VisitController(visitService);

        // Vet 3-Tier setup using manual dependency injection (DI)
        VetRepository vetRepository = new VetRepository();
        VetService vetService = new VetService(vetRepository);
        VetController vetController = new VetController(vetService);

        // Owner test data

        // create our owners
        Owner owner1 = new Owner(1L, "Homer Simpson", "742 Evergreen Terrace", "Springfield", "939-555-0113");
        Owner owner2 = new Owner(2L, "Marge Simpson", "742 Evergreen Terrace", "Springfield", "939-555-0113");
        Owner owner3 = new Owner(3L, "Lisa Simpson", "742 Evergreen Terrace", "Springfield", "939-555-0113");
        Owner owner4 = new Owner(4L, "Bart Simpson", "742 Evergreen Terrace", "Springfield", "939-555-0113");

        // save owners to database
        ownerController.add(owner1);
        ownerController.add(owner2);
        ownerController.add(owner3);
        ownerController.add(owner4);

        // get all owners from database and display them
        List<Owner> owners = ownerController.getAll();
        display(owners);


        // Pet test data

        // create our pets

        Pet pet1 = new Pet(1L, owner1, "big boyo", "02/26/1996", "Golden Retriever");
        Pet pet2 = new Pet(2L, owner2, "small boyo", "09/26/2001", "Poodle");
        Pet pet3 = new Pet(3L, owner3, "bigger boyo", "10/26/2050", "Hot Dog");
        Pet pet4 = new Pet(4L, owner4, "smallest boyo", "05/08/2014", "Shepard");

        // save pets to database
        petController.add(pet1);
        petController.add(pet2);
        petController.add(pet3);
        petController.add(pet4);

        // get all owners from database and display them
        List<Pet> pets = petController.getAll();
        display(pets);

        // Visit test data
        // create our pets

        Visit visit1 = new Visit(1L, "05/25/2017","vaccinations");
        Visit visit2 = new Visit(2L, "05/25/2019","surgery");
        Visit visit3 = new Visit(3L, "05/25/1009","check up");
        Visit visit4 = new Visit(4L, "05/25/2002","for fun");

        // save pets to database
        visitController.add(visit1);
        visitController.add(visit2);
        visitController.add(visit3);
        visitController.add(visit4);

        // get all owners from database and display them
        List<Visit> visits = visitController.getAll();
        display(visits);

        // Vet test data
        Vet vet1 = new Vet(1L, "cool guy","neurology");
        Vet vet2 = new Vet(2L, "sad guy","surgery");
        Vet vet3 = new Vet(3L, "fun guy","check ups");
        Vet vet4 = new Vet(4L, "mad guy","dentistry");

        // save pets to database
        vetController.add(vet1);
        vetController.add(vet2);
        vetController.add(vet3);
        vetController.add(vet4);

        // get all owners from database and display them
        List<Vet> vets = vetController.getAll();
        display(vets);


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
