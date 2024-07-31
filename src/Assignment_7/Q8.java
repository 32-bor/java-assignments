package Assignment_7;

public class Q8 {
    public static void main(String[] args) {
        Distance d = new Distance(10,20,30);
        d.display();
        Distance d1=new Distance(10,20,30);
        Distance d2=d.add(d1);
        d2.display();
    }
}

class Distance{
    private int km;
    private int m;
    private int cm;
    Distance(int km,int m,int cm){
        this.km=km;
        this.m=m;
        this.cm=cm;
    }
    public void setKm(int km){
        this.km=km;
    }
    public void setM(int m){
        this.m=m;
    }
    public void setCm(int cm){
        this.cm=cm;
    }
    public void display(){
        System.out.println(km+"km "+m+"m "+cm+"cm");
    }
    public Distance add(Distance d){
        km=km+d.km;
        m=m+d.m;
        cm=cm+d.cm;
        return this;
    }
}
