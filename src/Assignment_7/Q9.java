package Assignment_7;

public class Q9 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.area());
        System.out.println(c.circumference());
    }
}

class Circle{
    private int radius;

    Circle(int radius){
        this.radius=radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public double circumference(){
        return 2*3.14*radius;
    }
}
