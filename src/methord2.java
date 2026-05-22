
import java.util.Scanner;
public class methord2 {
    static int getmaximum(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a");
        int a= sc.nextInt();
        System.out.println("enter b");
        int b= sc.nextInt();
        int result= getmaximum(a,b);
        System.out.println("the maximum umber is"+result);

    }
}
