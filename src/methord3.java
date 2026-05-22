import java.util.Scanner;

public class methord3 {
    static void calculatepercentage(float obtain,float total){
        float percentage= (obtain/total*100);
        System.out.println("percentage obtain ="+ percentage);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float obtain= sc.nextInt();
        float total= sc.nextInt();

      calculatepercentage(obtain,total);
    }
}
