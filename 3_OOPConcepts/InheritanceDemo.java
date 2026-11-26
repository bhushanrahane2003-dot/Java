/**
 * Program 3.3: Demonstrates Inheritance in Java using 'extends'.
 * The child class (Dog) inherits fields and methods from the parent class (Animal).
 */
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Dog inherits from Animal
class Dog extends Animal {
    String breed;

    void bark() {
        System.out.println(name + " (" + breed + ") says: Woof! Woof!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";      // Inherited field
        myDog.breed = "Labrador";  // Child class field

        myDog.eat();   // Inherited method
        myDog.sleep(); // Inherited method
        myDog.bark();  // Child class method
    }
}
