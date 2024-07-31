package Assignment_7;

public class Q5 {
    public static void main(String[] args) {
        Contact c = new Contact(1,"Sukhdeep","Virk","8950807873","ssv@gmail.com");
        System.out.println(c);
    }
}

class Contact{
    private int id;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String email;
    Contact(int id,String firstName,String lastName,String mobileNo,String email){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.mobileNo=mobileNo;
        this.email=email;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setMobileNo(String mobileNo){
        this.mobileNo=mobileNo;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getMobileNo(){
        return mobileNo;
    }
    public String getEmail(){
        return email;
    }
    @Override
    public String toString(){
        return "Contact{id:"+id+", fistName:"+firstName+", lastName:"+lastName+", mobileNo:"+mobileNo+", email:"+email
                +'}';
    }
}
