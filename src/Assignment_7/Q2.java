package Assignment_7;

public class Q2 {
    public static void main(String[] args) {
        Time t = new Time(3,45,20);
        t.displayTime();
        System.out.println(t);
    }
}

class Time{
    private int hr;
    private int min;
    private int sec;
    Time(int hr,int min,int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
    public void setHr(int hr){
        this.hr=hr;
    }
    public void setMin(int min){
        this.min=min;
    }
    public void setSec(int sec){
        this.sec=sec;
    }
    public void displayTime(){
        System.out.println(hr+"hr"+" "+min+"min"+" "+sec+"sec");
    }
    @Override
    public String toString(){
        return "Time{"+hr+"hr"+" "+min+"min"+" "+sec+"sec"+'}';
    }

}
