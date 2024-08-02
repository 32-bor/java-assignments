package Assignment_8;

public class Q5 {
    public static void main(String[] args) {
        Box b = new Box(10,20,30,5);
        System.out.println(b);
    }
}

class Box{
    private int length;
    private int breadth;
    private int height;
    private int boxCount;

    Box(int length,int breadth,int height,int boxCount){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        this.boxCount=boxCount;
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
    public void setBoxCount(int boxCount){
        this.boxCount=boxCount;
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
    public int getBoxCount(){
        return boxCount;
    }
    public void displayBoxCount(){
        System.out.println("BoxCount:"+boxCount);
    }
    @Override
    public String toString(){
        return "Dimensions{Length:"+length+", Breadth:"+breadth+", Height:"+height+", BoxCount:"+boxCount+"}";
    }
}
