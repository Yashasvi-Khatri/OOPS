// Parent class
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (inherits from Animal)
class Dog extends Animal {
    // Overriding the makeSound() method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Parent class object
        myAnimal.makeSound(); // Calls Animal's method

        Dog myDog = new Dog(); // Child class object
        myDog.makeSound(); // Calls Dog's overridden method

        // Polymorphism: Parent reference pointing to a Child object
        Animal myPet = new Dog();
        myPet.makeSound(); // Calls Dog's overridden method due to dynamic binding
    }
}
