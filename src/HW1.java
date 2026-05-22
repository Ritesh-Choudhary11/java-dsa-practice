import java.util.Scanner;
public class HW1 {
    public static  void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        for(int i=1 ; i<=number ; i++){
            if(i==6){
                continue;
            }
            System.out.println("number="+i);
        }

    }
}
