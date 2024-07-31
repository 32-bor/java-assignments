package Assignment_4;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int x = sc.nextInt();
        System.out.println(x>99 && x<1000?"y":"n");
    }
}
