
class Animal {
    String color = "Brown";
    Animal() {
        System.out.println("Animal constructor called.");
    }
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    String color = "Golden";
    Dog() {
        super();
        System.out.println("Dog constructor called.");
    }
    void sound() {
        super.sound(); 
        System.out.println("Dog barks.");
    }
    void displayColor() {
        System.out.println("Dog color: " + color);        
        System.out.println("Animal color: " + super.color); 
    }
}

public class Ques_8 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.displayColor();
    }
}
