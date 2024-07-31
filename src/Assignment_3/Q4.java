package Assignment_3;

public class Q4 {
    public static void main(String[] args) {
        int x=1234;
        int sum=0;
        while(x>0){
            sum+=x%10;
            x/=10;
        }
        System.out.println(sum);
    }
}
