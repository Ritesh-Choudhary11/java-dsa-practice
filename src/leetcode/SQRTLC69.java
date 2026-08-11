package leetcode;
import java.util.Scanner;
public class SQRTLC69 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int s=1;
        int e=x;
        int ans=0;
        if(x==0){
            System.out.println(0);
        }
        while(s<=e){
            int mid=(s+e)/2;
            if(mid==x/mid){
                System.out.println("ans from mis is"+mid);
                break;
            }
            else if (mid>x/mid) {
                e=mid-1;
            }
            else{
                ans=mid;
                s=mid+1;
            }

        }
        System.out.println("ans is"+ans);
    }
}
