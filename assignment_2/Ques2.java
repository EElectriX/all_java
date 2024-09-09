class Shape2 {
    private int length;
    private int breadth;
    private int height;

    public void set(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Height: " + height);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("Volume: " + volume());
    }

    private int area() {
        return length * breadth;
    }

    private int perimeter() {
        return 2 * (length + breadth);
    }

    private int volume() {
        return length * breadth * height;
    }
}

public class Ques2 {
    public static void main(String args[]) {
        Shape2 shape = new Shape2();

        shape.set(5,3,10);

        shape.display();
    }
}
