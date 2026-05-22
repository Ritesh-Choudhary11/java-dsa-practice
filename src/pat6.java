import java.util.Scanner;
public class pat6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int row=1;row<=n;row++){
            char ch='E';
            for(int col=1;col<=row;col++){
                System.out.print(ch +"  ");
                ch--;
            }
            System.out.println();

        }



    }
}
