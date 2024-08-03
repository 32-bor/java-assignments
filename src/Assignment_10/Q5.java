package Assignment_10;

public class Q5 {
    private  static int y;
    public static void main(String[] args) {
        y = Integer.parseInt(args[0]);
        CheckPrime c = new CheckPrime(y);
        System.out.println(c.isPrime());
    }
}

class CheckPrime{
    private int x;
    CheckPrime(int x){
        this.x=x;
    }
    public int isPrime(){
        for(int i=2;i<x;i++){
            if(x%i==0)
                return -1;
        }
        return 1;
    }
}
