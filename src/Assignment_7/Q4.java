package Assignment_7;

public class Q4 {
    public static void main(String[] args) {
        Employee e = new Employee(1,"Sukhi",100000);
        System.out.println(e);
    }
}

class Employee{
    private int empid;
    private String name;
    private double salary;
    Employee(int empid,String name, double salary){
        this.empid=empid;
        this.name=name;
        this.salary=salary;
    }
    public void setEmpid(int empid){
        this.empid=empid;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public int getEmpid(){
        return empid;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        return "Employee{empid:"+empid+", name:"+name+", salary:"+salary+'}';
    }
}
