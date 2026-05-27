package EmployeeManagment.main;

import EmployeeManagment.Manager;
import EmployeeManagment.employee;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        int id= sc.nextInt();
        int salary= sc.nextInt();
        int bonous= sc.nextInt();

        Manager M=new Manager(name,id,salary,bonous);
        System.out.println(M.name);
        System.out.println(M.id);
        System.out.println(M.salary);
        System.out.println(M.bonous);

    }
}
