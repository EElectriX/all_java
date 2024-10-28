class Employee { 
    void sallary() {
        System.out.println("This is salary of Employee.");
    }
}
class Engineer extends Employee {
    void code() {
        System.out.println("Software Engieers can do code.");
    }
}
public class Ques_2 {
    public static void main(String[] args) {
   
        Engineer sde= new Engineer();

     
        sde.sallary();
        sde.code();
    }
}
