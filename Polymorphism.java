//Polymorphism คือ การสร้างเมทอดที่มีชื่อเดียวกันแต่มีการทำงานที่แตกต่างกัน โดยการสืบทอดคลาส หรือการสร้างอ็อบเจ็คที่มีคลาสเดียวกัน แต่มีการทำงานที่แตกต่างกัน
// Animal class (superclass)
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// คลาส Dog สืบทอดจาก Animal
class Dog extends Animal {
    // Override sound method
    // Override คือการเขียนทับ method ของ superclass
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class (subclass of Animal)
class Cat extends Animal {
    // Override sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // สร้าง object ของ Animal, Dog และ Cat
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Polymorphism: calling sound method of different objects
        animal.sound(); // Output: Animal makes a sound
        dog.sound(); // Output: Dog barks
        cat.sound(); // Output: Cat meows
    }
}
