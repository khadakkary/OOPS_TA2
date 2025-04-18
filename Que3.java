class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound(); // from parent class
        d.bark();      // from child class
    }
}
