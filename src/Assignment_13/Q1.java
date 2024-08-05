package Assignment_13;

public class Q1 {
    public void isEvenOrOdd(int n){
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public int greatestNumber(int a, int b, int c){
        return a>b?a>c?a:c:b>c?b:c;
    }
    public int countDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
    public int reverseNumber(int n){
        int newNumber=0;
        while(n>0){
            newNumber = newNumber*10+n%10;
            n/=10;
        }
        return newNumber;
    }
    public int sumNatural(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public int sumOddNatural(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=2*i-1;
        }
        return sum;
    }
    public int sumEvenNatural(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=2*i;
        }
        return sum;
    }
    public int sumSquaresNatural(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i*i;
        }
        return sum;
    }
    public int sumDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int factorial(int n){
        if(n==0 || n==1)
            return 1;
        return n*factorial(n-1);
    }
}
