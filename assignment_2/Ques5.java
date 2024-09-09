class Info{ 
    int age; 
    String name; 
    public Info(){ 
     age = 0; 
     name="unknown"; 
    } 
    public Info(int num){ 
     age = num; 
     name="unknown"; 
    } 
    public Info(String n){ 
     age = 0; 
     name=n; 
    } 
    
    public Info(int num , String n){ 
     age = num; 
     name=n; 
    } 
    public void details(){ 
     System.out.println("Name :- " + name + "   age :- "+age); 
    } 
   } 
   public class Ques5{ 
   public static void main(String[] args){ 
    Info a = new Info("Saptarshi"); 
    a.details(); 
    
   } 
   }