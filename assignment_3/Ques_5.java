class Calculator{
    public static int add(int a, int b){
       return a + b;
    }
    public static int add(int a, int b, int c){
       return a + b + c;
    }
 }
 
 public class Ques_5 {
    public static void main(String args[]){
       System.out.println(Calculator.add(20, 40));
       System.out.println(Calculator.add(40, 50, 60));
    }
 }