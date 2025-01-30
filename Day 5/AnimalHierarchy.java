// Creating the uperclass Animal
class Animal {
    // Attributes of the Animal class
    String name;
    int age;

    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("Animal's Sound");
    }
}

// Dog class extends Animal
class Dog extends Animal {

    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Cat class extends Animal
class Cat extends Animal {

    public void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

// Bird class extends Animal
class Bird extends Animal {

    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }
}

// Creating the Main class
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Creating instances of Dog, Cat, and Bird
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        // Initialzing the values
        dog.name = "tommy";
        cat.name = "tom";
        bird.name = "Humming Bird";

        // Demonstrating polymorphism: calling makeSound on each object
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}