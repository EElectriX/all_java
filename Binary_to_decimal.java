import java.lang.Math;
class Binary_to_decimal{
public static void main (String[]args){
System.out.println("your input is: "+args[0]);
int num=Integer.parseInt(args[0]);
int rem=0;
int dec=0;
int i=0;
while(num>0){
rem=num%10;
dec=dec+rem*(int)Math.pow(2,i);
i++;
num=num/10;
}
System.out.println(dec);
}
}


