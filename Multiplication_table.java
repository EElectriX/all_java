class Multiplication_table{
public static void main (String[]args){
System.out.println("Your entered number is : "+args[0]);
int number= Integer.parseInt(args[0]);
for (int i =1; i<=10;i++){
System.out.println(args[0]+"x"+i+"="+number*i);
}
}
}
