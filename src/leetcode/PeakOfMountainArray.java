package leetcode;

public class PeakOfMountainArray {
    public static void main(String[] args) {
        int arr[]={0,10,5,2};
        int n=arr.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                System.out.println(mid);
                break;
            }
            else if(arr[mid-1]>arr[mid]){
                e=mid-1;
            }
            else if(arr[mid+1]>arr[mid]){
                s=mid+1;
            }

        }

    }

}
