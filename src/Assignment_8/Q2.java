package Assignment_8;

public class Q2 {
    public static void main(String[] args) {
        SuperCar sc = new SuperCar("sukhdeep",100,"black","jeep");
        System.out.println(sc);
        SuperCar sc2 = new SuperCar("robin",100,"black","GMC");
        System.out.println(sc2);

    }
}

class SuperCar{
    private String ownerName;
    private double price;
    private String color;
    private String brand;
    private static int count=0;
    public SuperCar(String ownerName, double price, String color, String brand){
        count++;
        System.out.println(count);
        if(count<=1) {
            this.ownerName = ownerName;
            this.price = price;
            this.color = color;
            this.brand = brand;
        }
        else
            System.out.println("ONLY ONE of its kind ");
//        System.out.println(count);
    }
    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public double getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
    public String getBrand(){
        return brand;
    }
    public static SuperCar createSuperCar(String ownerName,double price, String color, String brand){
        System.out.println(count);

        if(count<=0){
            SuperCar sc = new SuperCar(ownerName, price, color, brand);
            return sc;
        }
        else
            return null;
    }
    @Override
    public String toString(){
        return "SuperCar {ProudOwner:"+ownerName+", Price:"+price+", Color:"+color+", Brand:"+brand+'}';
    }
}


