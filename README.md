# java-sprint1-task6
Introduccion to generics in java

## Exercises

### Level 1

#### Exercise 1

Create a class named `NoGenericMethods` that stores three arguments of the same type. Implement methods to store and retrieve these objects, as well as a constructor to initialize all three. Ensure that arguments can be passed in any order when calling the constructor.

#### Exercise 2

Create a class named `Persona` with attributes: `name`, `surname`, and `age`. Then, create a class named `GenericMethods` with a generic method that accepts three arguments of generic types. This method should print the received arguments to the console. In the `main()` method of the main class, call the generic method with different types of parameters.

**Example:** Pass an object of class `Persona`, a `String`, and a primitive type. This verifies that any type of parameter can be passed in any order.

### Level 2

#### Exercise 1

Modify the previous exercise so that one of the arguments in the generic method is not generic.

#### Exercise 2

Modify the previous exercise so that the generic method accepts a variable-length argument list.

### Level 3

#### Exercise 1

Create an interface named `Telefon` and three classes: `Smartphone`, `Generica`, and `Principal`.

- The `Telefon` interface must have a method named `trucar()`.
- The `Smartphone` class must implement `Telefon` and include an additional method named `ferFotos()`.
- The `Generica` class must contain two generic methods:
  - The first method should accept an argument limited by the `Telefon` interface.
  - The second method should accept an argument limited by the `Smartphone` class.
  - Inside these methods, call the relevant methods from `Telefon` and `Smartphone`.
- In the `main()` method of the `Principal` class, pass an instance of `Smartphone` to both generic methods in `Generica`.

**Question:** Can the method in `Generica` that is limited by the `Telefon` interface call the `ferFotos()` method?

## Getting Started

1. Clone this repository:
   ```sh
   git clone https://github.com/your-repo/java-exercises.git
2. Open the project in your preferred IDE.

3. Compile and run the programs to test your implementations.


