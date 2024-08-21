class Sum_of_digit{
public static void main (String[]args){
System.out.println("Your entered number is:"+ args[0]);
int number=Integer.parseInt(args[0]);
int result=0;
int rem=0;
while(number>0 || result>9){
if (number == 0){
number=result;
result=0;
}
rem=number%10;
result=result+rem;
number=number/10;
}
System.out.println("The answer is:"+result);
}
}





