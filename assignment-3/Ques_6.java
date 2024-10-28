class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Barks");
    }
}


public class Ques_6 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        

        animal.sound(); 
    }
}
