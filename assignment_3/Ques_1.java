class Animal {
    final void sound() {
        System.out.println("This is a generic animal sound.");
    }
}

class Dog extends Animal {
    
    // void sound() {
    //     System.out.println("Barks");
    // }
}


final class Bird {
    void fly() {
        System.out.println("Bird is flying.");
    }
}


// class Sparrow extends Bird {}


class Circle {
    final double PI = 3.14159; 
    double calculateArea(double radius) {
        return PI * radius * radius;
    }
}

public class Ques_1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); 

        Bird bird = new Bird();
        bird.fly();

        Circle circle = new Circle();
        System.out.println("Circle area with radius 5: " + circle.calculateArea(5));
    }
}
