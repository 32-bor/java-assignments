package Assignment_9;

public class Q2 {
    public static void main(String[] args) {
        MarkSheet m1=new MarkSheet(56.0,76.0,83.0,23.0,98.0);
        System.out.println(m1);
        System.out.println(m1.maxMarks());
        System.out.println(m1.avgMarks());
        m1.passOrFail(m1.getChemistry());
        m1.passOrFail(m1.getEnglish());
        m1.passOrFail(m1.getHindi());
    }
}

class MarkSheet{
    private Double physics;
    private Double maths;
    private Double chemistry;
    private Double english;
    private Double hindi;

    MarkSheet(Double physics,Double maths, Double chemistry, Double english, Double hindi){
        this.physics=physics;
        this.maths=maths;
        this.chemistry=chemistry;
        this.english=english;
        this.hindi=hindi;
    }
    public void setPhysics(Double physics){
        this.physics=physics;
    }
    public void setMaths(Double maths){
        this.maths=maths;
    }
    public void setChemistry(Double chemistry){
        this.chemistry=chemistry;
    }
    public void setEnglish(Double english){
        this.english=english;
    }
    public void setHindi(Double hindi){
        this.hindi=hindi;
    }
    public Double getPhysics(){
        return physics;
    }
    public Double getMaths(){
        return maths;
    }
    public Double getChemistry(){
        return chemistry;
    }
    public Double getEnglish(){
        return english;
    }
    public Double getHindi(){
        return hindi;
    }
    @Override
    public String toString(){
        return "Marks {Physics:"+physics+", Maths:"+maths+", Chemistry:"+chemistry+", English:"+english+", Hindi:"
                +hindi+"}";
    }
    public Double maxMarks(){
        Double max=0.0;
        if(physics>max)
            max=physics;
        if(maths>max)
            max=chemistry;
        if(chemistry>max)
            max=chemistry;
        if(english>max)
            max=english;
        if(hindi>max)
            max=hindi;
        return  max;
    }
    public Double avgMarks(){
        Double avg=0.0;
        avg = (physics+maths+chemistry+english+hindi)/5;
        return avg;
    }
    public void passOrFail(Double marks){
        if(marks>=50.0)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
