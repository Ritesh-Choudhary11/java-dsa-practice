import java.util.Scanner;
public class Bitwiseoperator {
    public static void main(String[] args) {
        int n=4;
            if((n&1)==0){
                System.out.println("is a even no");
            }
            else{
                System.out.println("not even");
            }

        Scanner sc=new Scanner(System.in);

        //power of 2(brute force)
        int n= sc.nextInt();
       int count=0;
       while(n!=0){
            if((n&1)==1){
                count++;
           }
           n= n>>1;
        }
        if(count>1){
            System.out.println("not a power of two");
        }
        else {
            System.out.println("power of two");
        }

        //power of two (mentos jindegi)
        int n= sc.nextInt();
        if((n&(n-1))==0){
            System.out.println("power of 2");
        }
        else{
            System.out.println("not a power of 2");
        }

        //power of 4
       int  count=0;
        int n= sc.nextInt();
        while((n&1)==0){
            count++;
            n=n>>1;
        }
        if((count % 2)==0){
            System.out.println("power of 4");
        }
        else{
         System.out.println("not power of 4");
        }

    }
}
