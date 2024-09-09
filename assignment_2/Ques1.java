class Shape{
int length ;
int breadth ;
int height ;
public void showinput(){
System.out.println("length is: " + length + " breadth is: "  + breadth + " height is: " + height) ;
}
public void area(){
 System.out.println("Area is: " + 2 * (length * breadth + breadth * height + length * height)) ;
}
public void perimeter(){
System.out.println("Perimeter is: " + 4 * ( length + breadth + height ) ) ;
}
public void volume(){
System.out.println("Volume is: " + length * breadth * height ) ;
}
}
class Ques1{
public static void main(String args[]){
Shape shape1 = new Shape() ;
shape1.length =  Integer.parseInt(args[0]) ;
shape1.breadth =  Integer.parseInt(args[1]) ;
shape1.height =  Integer.parseInt(args[2]) ;
shape1.showinput() ;
shape1.area() ;
shape1.perimeter() ;
shape1.volume() ;
}
}