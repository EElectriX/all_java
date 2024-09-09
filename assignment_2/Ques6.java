class Room{ 
    private int length; 
    private int width; 
    private int height; 
    public Room(int x,int y,int z){ 
    this.length=x; 
    this.width=y; 
    this.height=z; 
    } 
    public int surfaceArea(){ 
    return 2*(length*width+length*height+width*height); 
    } 
    public int volume(){ 
    return length*width*height; 
    } 
    } 
    public class Ques6 { 
    public static void main(String[] args){ 
    int l=Integer.parseInt(args[0]); 
    int w=Integer.parseInt(args[1]); 
    int h=Integer.parseInt(args[2]); 
    Room op = new Room(l,w,h); 
    System.out.println("Surface Area is :- " + op.surfaceArea()); 
    System.out.println("Volume is :- " + op.volume());
    }
}