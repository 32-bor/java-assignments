package Assignment_13;

import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no");
        int x = scanner.nextInt();
        Q1 q = new Q1();
        System.out.println(q.factorial(x));
    }
}
