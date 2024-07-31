package Assignment_7;

public class Q3 {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(10,20,30);
        System.out.println(c.volume());
        System.out.println(c.surfaceArea());
        System.out.println(c);

    }
}

class Cuboid{
    private int length;
    private int breadth;
    private int height;
    Cuboid(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    public void setLength(int length){
        this.length=length;
    }
    public void setBreadth(int breadth){
        this.breadth=breadth;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public int getHeight(){
        return height;
    }
    public int volume(){
        return length*breadth*height;
    }
    public int surfaceArea(){
        return 2*(length*breadth+breadth*height+length*height);
    }
    @Override
    public String toString(){
        return "Cuboid{length="+length+" "+"breadth="+breadth+" "+"height="+height+'}';
    }
}