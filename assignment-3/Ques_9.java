class A
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}
class B extends A
{
  
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
}

public class Ques_9
{    public static void main(String args[])
    {  
        A a = new A();
        B b = new B();    
        A ref;  
        ref = a;
        ref.m1();
        ref = b;
        ref.m1();

    
    }
}
