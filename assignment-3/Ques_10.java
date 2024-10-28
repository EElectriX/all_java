abstract class Shape {
    abstract double calc_area();
    abstract double calc_volume();
    
}
class Sphere extends Shape{
    double radius;
    Sphere(double radius){
        this.radius = radius;
    }
    double calc_area(){
       return 4*Math.PI * radius * radius;
    }
    double calc_volume(){
        return 4/3*Math.PI * radius * radius * radius;
    }
}
class Cone extends Shape{
    double radius;
    double height;
    Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    double calc_area(){
        return Math.PI * radius * (radius + Math.sqrt(height*height + radius*radius));
    }
    double calc_volume(){
        return Math.PI * radius * radius * height / 3;
    }
}

class Cylinder extends Shape{
    double radius;
    double height;
    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    double calc_area(){
        return 2*Math.PI*radius*(radius+height);
    }
    double calc_volume(){
        return Math.PI * radius * radius * height;
    }
}

class Box extends Shape {
    double length;
    double breadth;
    double height;
    Box(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    double calc_area(){
        return 2*(length*breadth+ breadth*height+ height*length);
    }
    double calc_volume(){
        return length*height*breadth;
    }
    
}


public class Ques_10 {
    public static void main(String[] args){
        Sphere s = new Sphere(4);
        System.out.println("Area of Sphere: "+s.calc_area());
        System.out.println("Volume of Sphere: "+s.calc_volume());

        Cone c = new Cone(4, 5);
        System.out.println("Area of Cone: "+c.calc_area());
        System.out.println("Volume of Cone: "+c.calc_volume());

        Cylinder cy = new Cylinder(4, 5);
        System.out.println("Area of Cylinder: "+cy.calc_area());
        System.out.println("Volume of Cylinder: "+cy.calc_volume());

        Box b = new Box(4, 5, 6);
        System.out.println("Area of Box: "+b.calc_area());
        System.out.println("Volume of Box: "+b.calc_volume());
    }
    
}
