# PetClinic Phase 1

#### Overview
In this phase of the project, you create a backend for the PetClinic application based on the existing PetClinic website at: 

[PetClinic Reference Application](http://petclinic.cognizantacademy.com)

This phase of the project involves learning about software architecture patterns and how we use them together to create software that is extensible, robust, maintainable and reusable.

#### What You Are Given

* Code for the `OwnerController`
* Code for the `OwnerService`
* Code for the `OwnerRepository`
* Models for `Owner`, `Pet` and `PetType`
* A `FakeDatabase`
* Supporting interfaces for the `FakeDatabase` (`Modifiable` and `CrudRepository`)

#### What You Need To Complete
* Implement an enumerated type for `Speciality` that will be used with the `Vet` Model.  Put it in the model package.
* Complete the design and implement classes for the rest of the models (`Pet` (you'll have to add code to this existing model), `Visit`, `Vet`).
* Be sure all of your model classes implement Modifiable.
* Extract out the FakeDatabase reference in `OwnerRepository` into an abstract class called `BasicRepository`
* Implement controllers, services and repositories for each of the models.
* Have all your repositories extend `BasicRepository`
* Design a `BasicController` interface that each of your controllers will implement that has the basic functionality currently in the `OwnerController` class.
* Design a `BasicService` interface that each of your services will implement that has the basic functionality currently in the `OwnerService` class.

Use the following patterns to complete this phase of the code:

* MVC
* 3-Tier application
* Inheritance
* Designing to interfaces

###### Bonus Activity 1 (easy) 
Create test classes for each of the controllers you added by completing the following:
* Place your cursor on the class name in the class header of the source code of the class you want to create the test for.
* Click `Alt-Enter`.
* Select `create test` then select all of the methods listed then click `OK`.
* Do this for each of your controllers.
* You do not need to implement any code for the tests - we're just creating the test stubs.

###### Bonus Activity 2 (medium)
* There is a design flaw in the `FakeDatabase` and how it stores data.  See if you can figure out what it is.
* Hint:  It has nothing to do with the code in the `FakeDatabase` itself.  It has to do with how models are stored in the `FakeDatabase`.

#### Notes
* Use the existing code as a pattern for the rest of your code.
* We are NOT creating a front end for this application.  The `PetClinicDriver` acts as the front end (or view) for this application. Feel free to add to the driver as needed.
* In this phase, you do NOT use Spring or Spring Boot.  Just plain ol' Java.
* In this phase, don't worry about handling errors.