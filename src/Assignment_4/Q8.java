package Assignment_4;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        char ch =')';
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            System.out.println("alphabet");
        else if(ch>='0' && ch<='9')
            System.out.println("digit");
        else
            System.out.println("other charcter");
    }
}
