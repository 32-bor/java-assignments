package Assignment_2;

public class Q3 {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println("x: "+x+", y: "+y);
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("x: "+x+", y: "+y);
    }
}
