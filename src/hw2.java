import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        for(int i=1 ; i<= number ; i++){
            if(i%2==0){
                continue;
            }
            System.out.println("the odd number between 1 to 20 are "+i);
        }
    }
}
