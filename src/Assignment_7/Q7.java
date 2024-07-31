package Assignment_7;

public class Q7 {
    public static void main(String[] args) {
        Course c = new Course(1,"Advanced Algorithms",5,500);
        System.out.println(c);


    }
}

class Course{
    private int courseId;
    private String courseName;
    private int duration;
    private double fee;

    Course(int courseId,String courseName, int duration,double fee){
        this.courseId=courseId;
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    public void setCourseId(int courseId){
        this.courseId=courseId;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
    public void setFee(double fee){
        this.fee=fee;
    }
    public int getCourseId(){
        return courseId;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getDuration(){
        return duration;
    }
    public double getFee(){
        return fee;
    }
    @Override
    public String toString(){
        return "Course{CourseId:"+courseId+", CourseName:"+courseName+", Duration:"+duration+"months, Fee:"+fee+'}';
    }
}
