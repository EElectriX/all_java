import java.lang.Math; 
class Shape{ 
public int calArea(int a){ 
return a*a; 
} 
public int calArea(int l , int w){ 
return l*w; 
} 
public double calArea(double a,double b,double c){ 
double s = (a+b+c)/2; 
return Math.sqrt((s-a)*(s-b)*(s-c)*s); 
}  
} 
public class Ques7{ 
public static void main (String[] args){ 
Shape op = new Shape(); 
//System.out.println("Area of Square " +op.calArea(10)); 
System.out.println("Area of rectangle "+op.calArea(1,2,2)); 
}  
}