class Animal1 {
    final void sound() {
        System.out.println("This is a generic animal sound.");
    }
}
class Dog1 extends Animal1 {    
    // void sound() {
    //     System.out.println("Barks");
    // }
}
final class Bird1 {
    void fly() {
        System.out.println("Bird is flying.");
    }
}
// class Sparrow extends Bird {}
class Circle1 {
    final double PI = 3.14159; 
    double calculateArea(double radius) {
        return PI * radius * radius;
    }
}
public class Ques_1 {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.sound(); 

        Bird1 bird = new Bird1();
        bird.fly();

        Circle1 circle = new Circle1();
        System.out.println("Circle area with radius 5: " + circle.calculateArea(5));
    }
}
