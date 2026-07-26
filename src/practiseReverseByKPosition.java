
import java.util.Scanner;
public class practiseReverseByKPosition {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int k=sc.nextInt();
                int arr[]={1,2,3,4,5,6,7};
                int n=arr.length;
                int brr[]=new int[k];
                for(int i=n-k,j=0;j<k;i++,j++){
                    brr[j]=arr[i];
                }

                for(int i=n-1-k,j=n-1;i>=0; i--,j--){
                    arr[j]=arr[i];
                }

                for(int i=0;i<k;i++){
                    arr[i]=brr[i];
                }

                for(int i=0;i<n;i++){
                    System.out.println(arr[i]);
                }


            }
        }


