package Assignment_3;

public class Q8 {
    public static void main(String[] args) {
        //int x= 5.5 % 1.5; this gives error as even though the modulo operator is allowed to have non integer operands
        //but the remainder is 1.0 which of type double and it can't be stored in int variable;

        double x = 5.5 % 1.5;
        System.out.println(x);
    }
}
