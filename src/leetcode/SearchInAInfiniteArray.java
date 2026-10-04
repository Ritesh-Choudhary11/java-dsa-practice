package leetcode;

public class SearchInAInfiniteArray{
    public static void main(String[] args){
        int arr[]={1,3,5,7,9,11,13};
        int target=9;
        int s=0;
        int i=1;
        int e=0;
        int n=arr.length;
        if (arr[0]==target) {
            System.out.println("0");
            return;
        }

        while(arr[i]<target){
            i=i*2;

            if (i>=n){
                i=n-1;
                break;
            }
        }

        // Binary Search
         s=i/2;
        e=i;
        while (s<=e) {
            int mid=s+(e-s)/2;
            if (arr[mid]==target) {
                System.out.println(mid);
                return;
            }
            else if (arr[mid]<target) {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        System.out.println("-1");
    }
}