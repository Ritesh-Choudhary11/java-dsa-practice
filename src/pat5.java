import java.util.Scanner;
public class pat5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no");
        int n= sc.nextInt();
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
              if(i==1||i==2||i==n){
                  System.out.print("* ");
              }
              else{
                  System.out.print("* ");
              }
            }
            for(int j=1;j<=(i-2);j++){
                System.out.print("  ");
            }

        }

        System.out.println();
    }
}
