# PetClinic Phase 1

#### Overview
In this phase of the project, you create a backend for the PetClinic application based on the existing PetClinic website at: 

[PetClinic Reference Application](http://petclinic.cognizantacademy.com)

#### What You Are Given

* Code for the `OwnerController`
* Code for the `OwnerService`
* Code for the `OwnerRepository`
* Models for `Owner`, `Pet` and `PetType`
* A `FakeDatabase`
* Supporting interfaces for the `FakeDatabase` (`Modifiable` and `CrudRepository`)

#### What You Need To Complete
* Complete the design and implement classes for the rest of the models (`Pet` (you'll have to add code to this existing model), `Visit`, `Vet`).
* Implement controllers, services and repositories for each of the models.

Use the following patterns to complete this phase of the code:

* MVC
* 3-Tier application
* Polymorphism (inheritance)
* Designing to interfaces

###### Bonus Activity (medium)
* There is a design flaw in the `FakeDatabase` and how it stores data.  See if you can figure out what it is.
* Hint:  It has nothing to do with the code in the `FakeDatabase` itself.  It has to do with how models are stored in the `FakeDatabase`.

#### Notes
* Use the existing code as a pattern for the rest of your code.
* We are NOT creating a front end for this application.  The `PetClinicDriver` acts as the front end (or view) for this application. Feel free to add to the driver as needed.
* In this phase, you do NOT use Spring or Spring Boot.  Just plain ol' Java.
* In this phase, don't worry about handling errors.