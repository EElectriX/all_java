public class Ques4 {
    
    public int add(int a, int b) {
        return a + b;
    }

   
    public int add(int a, int b, int c) {
        return a + b + c;
    }

   
    public double add(double a, double b) {
        return a + b;
    }

    
    public double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Ques4 calc = new Ques4();

        
        System.out.println("Sum of 5 and 10 (int): " + calc.add(5, 10)); 
        System.out.println("Sum of 5, 10, and 15 (int): " + calc.add(5, 10, 15)); 
        System.out.println("Sum of 5.5 and 3.2 (double): " + calc.add(5.5, 3.2)); 
        System.out.println("Sum of 5 and 3.2 (int and double): " + calc.add(5, 3.2)); 
}
}