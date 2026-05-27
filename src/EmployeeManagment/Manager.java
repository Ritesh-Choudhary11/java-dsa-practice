package EmployeeManagment;

public class Manager extends employee {
    public int bonous;

   public Manager(String name,int id,int salary,int bonous){
        super(name,id,salary);
        this.bonous=bonous;
    }



}
