package Assignment_6;

public class Q6 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            int k=i;
            for(int j=1;j<=4;j++){
                if(j<=i) {
                    System.out.print(k + " ");
                    k--;
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
