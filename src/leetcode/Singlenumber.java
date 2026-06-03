package leetcode;

public class Singlenumber{
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum^arr[i];
        }
        System.out.println(sum);
    }
}
