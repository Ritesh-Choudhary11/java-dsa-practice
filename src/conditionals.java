import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of problem solved");
       int problem= sc.nextInt();
       if(problem >= 300) {
           System.out.println("Advanced Programmer");
       }
           else if(problem >= 150) {
           System.out.println("intermediate programmer");
       }
               else{
                   System.out.println("Beginner");
               }
           }
       }



