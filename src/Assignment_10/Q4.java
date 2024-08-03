package Assignment_10;

public class Q4 {
    public static void main(String[] args) {
        LCM obj = new LCM(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        System.out.println(obj.calculateLCM());
    }
}

class LCM{
    private int x;
    private int y;
    LCM(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int calculateLCM(){
        for(int i=x>y?x:y;i<=x*y;i++){
            if(i%x==0 && i%y==0)
                return i;
        }
        return 0;
    }
}
