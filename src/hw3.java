import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of row");
        int row= sc.nextInt();

        System.out.println("enter no of col");
        int col= sc.nextInt();
        for(int i=1 ; i<=row ; i++){
            for(int j=1 ; j<=col ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
