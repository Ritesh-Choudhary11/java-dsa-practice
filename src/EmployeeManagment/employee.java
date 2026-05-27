package EmployeeManagment;

public class employee {
    public String name;
    public int id;
    public int salary;


    employee() {
        this.name = "";
        this.id = -1;
        this.salary = -1;
    }

    employee(String name,int id,int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    }

