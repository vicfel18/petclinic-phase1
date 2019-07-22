# PetClinic Phase 1

#### Overview
In this phase of the project, you create a backend for the PetClinic application based on the existing PetClinic website at: 

[PetClinic Reference Application](http://petclinic.cognizantacademy.com)

This phase of the project involves learning about software architecture patterns and how we use them together to create software that is extensible, robust, maintainable and reusable.

#### What You Are Given

* Starter code for all models.
* Starter code for all controllers.
* Starter code for all services.
* Starter code for all repositories.
* Starter code for the driver class.
* A `FakeDatabase` used to store data.

#### What You Need To Complete

###### TODOs
* Complete the TODOs in the model package.
* Complete the TODOs in the repository package.
* Complete the TODOs in the service package.
* Complete the TODOs in the controller package.
* Complete the TODOs in the `PetClinicDriver` class.

###### Coding to Interfaces - Repository
* In your repository package, create a new abstract class called `BasicRepository`.  
* In the `BasicRepository`, add one field - a protected `FakeDatabase`.
* In the `BasicRepository`, add a default constructor that initializes the fakeDatabase field to an instance of the FakeDatabase.
* Have each of your Repositories extend your new BasicRepository.
* Remove the `FakeDatabase` field from each of your repositories.
* Remove the constructor from each of your repositories.

###### Coding to Interfaces - Service
* Inside your service package, create a new interface called `BasicService`.
* `BasicServce` is a generic class that defines the following methods:
  - `T add(T t);`
  - `T get(int id);`
  - `T modify(T t);`
  - `boolean delete(T t);`
  - `List<T> getAll();`
* Modify each of your services to implement `BasicService`.

###### Coding to Interfaces - Controller
* Inside your controller package, create a new interface called `BasicController`.
* `BasicController` is a generic interface that defines the following methods:
  - `T add(T t);`
  - `T get(int id);`
  - `T modify(T t);`
  - `boolean delete(T t);`
  - `List<T> getAll();`
* Modify each of your controllers to implement `BasicController`.

###### Patterns
The following patterns are used to complete this phase of the code:
* MVC
* 3-Tier application
* Inheritance
* Designing to interfaces

#### Bonus Activities
###### Bonus Activity 1 (easy) 
Create test classes for each of the controllers you added by completing the following:
* Place your cursor on the class name in the class header of the source code of the class you want to create the test for.
* Hit `Alt-Enter`.
* Select `create test` then select all of the methods listed then click `OK`.
* Do this for each of your controllers.
* You do not need to implement any code for the tests - we're just creating the test stubs.

###### Bonus Activity 2 (medium)
* There is a design flaw in the `FakeDatabase` and how it stores data.  See if you can figure out what it is.
* Hint:  It has nothing to do with the code in the `FakeDatabase` itself.  It has to do with how models are stored in the `FakeDatabase`.

#### Notes
* Use the existing code as a pattern to complete the rest of your code.
* We are NOT creating a front end for this application.  The `PetClinicDriver` acts as the front end (or view) for this application. Feel free to add to the driver as needed.
* In this phase, you do NOT use Spring or Spring Boot.  Just plain ol' Java.
* In this phase, don't worry about handling errors.