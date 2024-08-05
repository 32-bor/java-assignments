package Assignment_11;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.lang.Math;

public class Q1{
    public static void main(String[] args) {
        Q1.printDate();
        Q1.printTime();
        Q1.printRandom();
        Q1.printRandom2();
    }
    public static void printDate(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toString());
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(f.format(now));
    }
    public static void printTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh-mm-ss");
        System.out.println(f.format(now));
    }
    public static void printRandom(){
        Random random = new Random();
        System.out.println(random.nextInt(100,201));
    }
    public static void printRandom2(){
        System.out.println(Math.random()*100+100);
    }
    public static void calculateRoots(int a,int b, int c){
        double x,y;
        x = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        y = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println(x);
        System.out.println(y);
    }

}


