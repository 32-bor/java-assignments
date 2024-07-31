package Assignment_6;

public class Q5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int k = 1;
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    System.out.print(k+" ");
                    k++;
                } else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
