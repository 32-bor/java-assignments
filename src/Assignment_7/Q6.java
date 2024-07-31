package Assignment_7;

public class Q6 {
    public static void main(String[] args) {
        Question q = new Question(1,"who is your Guru?","Gobind","Gobind","Gobind","Gobind","you knew it alreay");
        q.display();;
        System.out.println(q);

    }
}

class Question{
    private int queNo;
    private String que;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;
    Question(int queNo,String que,String optionA,String optionB,String optionC,String optionD,String answer){
        this.queNo=queNo;
        this.que=que;
        this.optionA=optionA;
        this.optionB=optionB;
        this.optionC=optionC;
        this.optionD=optionD;
        this.answer=answer;
    }
    public void setQueNo(int queNo){
        this.queNo=queNo;
    }
    public void setQue(String que){
        this.que=que;
    }
    public void setOptionA(String optionA){
        this.optionA=optionA;
    }
    public void setOptionB(String optionB){
        this.optionB=optionB;
    }
    public void setOptionC(String optionC){
        this.optionC=optionC;
    }
    public void setOptionD(String optionD){
        this.optionD=optionD;
    }
    public void display(){
        System.out.println("QueNo:"+queNo+" Que:"+que+"\nOption A:"+optionA+"\nOption B:"+optionB
        +"\nOption C:"+optionC+"\nOption D:"+optionD+"\nAnswer: "+answer);
    }
    @Override
    public String toString(){
        return "Question{Question No:"+queNo+" Question:"+que+" Option A:"+optionA+", Option B:"+optionB+", Option C:"
                +optionC+", Option D:"+optionD+'}';
    }
}
