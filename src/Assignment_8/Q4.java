package Assignment_8;

public class Q4 {
    public static void main(String[] args) {
        Batch b1 = new Batch("L6Z", "Advanced Algorithms","1st Oct", 5, "5 months", 50, 2);
        System.out.println(b1);

    }
}

class Batch{
    private String batchCode;
    private String courseName;
    private String startDate;
    private int studentCount;
    private String time;
    private int days;
    private int totalNoOfBatches;

    Batch(String batchCode, String courseName, String startDate, int studentCount, String time, int days, int totalNoOfBatches){
        this.batchCode=batchCode;
        this.courseName=courseName;
        this.startDate=startDate;
        this.studentCount=studentCount;
        this.time=time;
        this.days=days;
        this.totalNoOfBatches=totalNoOfBatches;
    }

    public void setBatchCode(String batchCode){
        this.batchCode=batchCode;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public void setStartDate(String startDate){
        this.startDate=startDate;
    }
    public void setStudentCount(int studentCount){
        this.studentCount=studentCount;
    }
    public void setTime(String time){
        this.time=time;
    }
    public void setDays(int days){
        this.days=days;
    }
    public void setTotalNoOfBatches(int totalNoOfBatches){
        this.totalNoOfBatches=totalNoOfBatches;
    }
    public String getBatchCode(){
        return batchCode;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getStartDate(){
        return startDate;
    }
    public int getStudentCount(){
        return studentCount;
    }
    public String getTime(){
        return time;
    }
    public int getDays(){
        return days;
    }
    public int getTotalNoOfBatches(){
        return totalNoOfBatches;
    }
    @Override
    public String toString(){
        return "BatchDetails {BatchCode:"+batchCode+", CourseName:"+courseName+", StartDate:"+startDate+
                ", StudentCount:"+studentCount+", Time:"+time+", Days:"+days+", TotalBatches:"+totalNoOfBatches
                +"}";
    }
}
