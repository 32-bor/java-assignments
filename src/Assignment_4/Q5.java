package Assignment_4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int x = sc.nextInt();
        System.out.println("Enter another no");
        int y = sc.nextInt();
        System.out.println("Greater no: "+ (x>y?x:y));
    }
}
