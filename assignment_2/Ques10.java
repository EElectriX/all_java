class ShapeArea {
    public void area() {
        System.out.println("Calculating areas of different shapes using method overloading.");
    }

    public int area(int side) {
        int squareArea = side * side;
        System.out.println("Area of Square: " + squareArea);
        return squareArea;
    }

    public int area(int length, int width) {
        int rectangleArea = length * width;
        System.out.println("Area of Rectangle: " + rectangleArea);
        return rectangleArea;
    }

    public double area(int base, int height, int unused) {
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of Triangle: " + triangleArea);
        return triangleArea;
    }

    public double area(double radius) {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + circleArea);
        return circleArea;
    }

    public double area(int x1, int y1, int x2, int y2) {
        double lineLength = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of Straight Line: " + lineLength);
        return lineLength;
    }
}

public class Ques10{
    public static void main(String[] args) {
        ShapeArea shapeArea = new ShapeArea();
        shapeArea.area();
        shapeArea.area(5);
        shapeArea.area(5, 10);
        shapeArea.area(6, 8, 0);
        shapeArea.area(7.0);
        shapeArea.area(1, 2, 4, 6);
    }
}
