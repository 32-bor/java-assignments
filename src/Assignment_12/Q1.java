package Assignment_12;

public class Q1 {
    public void printNatural(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
    public void printNaturalReverse(int n){
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
    public void printOddNaturalNumbers(int n){
        for(int i=1;i<=n;i++){
            System.out.println(2*i-1);
        }
    }
    public void printOddNaturalNumbersReverse(int n){
        for(int i=n;i>=1;i--){
            System.out.println(2*i-1);
        }
    }
    public void printEvenNaturalNumbers(int n){
        for(int i=1;i<=n;i++){
            System.out.println(2*i);
        }
    }
    public void printEvenNaturalNumbersReverse(int n){
        for(int i=n;i>=1;i--){
            System.out.println(2*i);
        }
    }
    public void printSquares(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i*i);
        }
    }
    public void printCubes(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i*i*i);
        }
    }
    public void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
