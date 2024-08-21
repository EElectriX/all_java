class Count_factor{
public static void main(String[]args){
System.out.println("Your entered number is:"+args[0]);
int num=Integer.parseInt(args[0]);
int count=0;
for (int i=1;i<=num;i++){
if(num%i==0){
count++;
}
}
System.out.println("The number of factors is:"+count);
}
}

