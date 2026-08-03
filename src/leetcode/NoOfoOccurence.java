package leetcode;

public class NoOfoOccurence {

    static int upperbound(int arr[],int target){
        int n=arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        int mid = (start + end) / 2;
        while(start<=end){
            if(arr[mid]<=target){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
           mid= (start + end) / 2;
        }
        return ans;

    }




    static int lowerbound(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3,};
        int target = 2;
        int ans1=lowerbound(arr,target);

        int ans2=upperbound(arr,target);
        int result =ans2-ans1+1;
        System.out.println(result);
    }
}

