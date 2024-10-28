
class Person {
    void person() {
        System.out.println("This is a person.");
    }
}


class Employee extends Person {
    void employee() {
        System.out.println("This is an employee.");
    }
}


class Manager extends Employee {
    void manager() {
        System.out.println("This is a manager.");
    }
}

public class Ques_3{
    public static void main(String[] args) {
      
        Manager emp1 = new Manager();

        emp1.person();
        emp1.employee();
        emp1.manager();
    }
}
