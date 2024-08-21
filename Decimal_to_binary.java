//2.Write a java Program to convert a decimal number to binary code
class Decimal_to_Binary{
public static void main(String[]args){
System.out.println("Your entered number is:" +args[0]);
int number=Integer.parseInt(args[0]);
String bin =" ";
int rem=0;
while (number>0){
rem=number%2;
number=number/2;
bin = rem+bin;
}
System.out.println("equivalent binary value is :"+bin);
}
}


