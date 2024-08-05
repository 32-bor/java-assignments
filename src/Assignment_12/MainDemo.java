package Assignment_12;

import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Q1 q = new Q1();
        q.printTable(x);
    }
}
