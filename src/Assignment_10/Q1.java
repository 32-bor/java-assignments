package Assignment_10;

public class Q1 {
    public static void main(String[] args) {
        int sum=0;

        for(int i=0;i<  args.length;i++){
            System.out.println("Arguement-"+(i+1)+": "+args[i]);
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}

