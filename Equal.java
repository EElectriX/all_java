public class Equal {
public static void main(String[]args){
int num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[1]);
int num3=Integer.parseInt(args[2]);
System.out.println("Your enterd number is :"+num1+" "+num2+" "+num3);
int sum=num1+num2;
if (sum==num3){
System.out.println("True");
}else {
System.out.println("False");
}
}           
}