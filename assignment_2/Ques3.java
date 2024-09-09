class Counter {
    private static int count = 0;
    public Counter() {   
        count++;
    }
    public static int getCount() {
        return count;
    }
    public static void resetCount() {
        count = 0;
    }
    public void displayCount() {
        System.out.println("Current count: " + getCount());
    }
}
public class Ques3{
    public static void main(String[] args) {
        System.out.println("Initial count: " + Counter.getCount());
        Counter c1 = new Counter();
        System.out.println("Count after creating instances: " + Counter.getCount());
        c1.displayCount();
        Counter.resetCount();
        System.out.println("Count after reset: " + Counter.getCount());
}
}