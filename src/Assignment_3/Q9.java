package Assignment_3;

public class Q9 {
    public static void main(String[] args) {
        int x = 235;
        x = x%10*100 + x/10%10*10 + x/10/10%10;
        System.out.println(x);
    }
}
