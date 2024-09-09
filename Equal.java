public class Equal {
public static void main(String[]args){
int num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[1]);
int num3=Integer.parseInt(args[2]);
System.out.println("Your enterd number is :"+num1+" "+num2+" "+num3);
if (num3==num1+num2){
System.out.println("True");
}else if (num2==num3+num1) {
System.out.println("True");
}else if (num1==num3+num2) {
System.out.println("True");
}else {
System.out.println("False");
}
}           
}