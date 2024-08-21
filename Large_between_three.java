class Large_between_three{
public static void main(String[]args){
int num1=Integer.parseInt(args[0]);
int num2=Integer.parseInt(args[1]);
int num3=Integer.parseInt(args[2]);
System.out.println("Your Entered three numbers is :"+num1+" "+num2+" "+num3);
if (num1>num2){
if (num1>num3){
System.out.println("The largest number is:"+num1);
}else{
System.out.println("The largest number is:"+num3);
}
}else if (num2>num3){
System.out.println("The largest number is:"+num2);
}
else {
System.out.println("The largest number is:"+num3);
}
}
}


