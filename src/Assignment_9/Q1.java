package Assignment_9;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
        System.out.println(c.getRadius());

    }
}

class Circle{
    private Integer radius;
    Circle(Integer radius){
        this.radius=radius;
    }
    public void setRadius(Integer radius){
        this.radius=radius;
    }
    public Integer getRadius(){
        return radius;
    }
    public Double getArea(){
        return 3.14*radius*radius;
    }
    public Double getCircumference(){
        return 2*3.14*radius;
    }
}