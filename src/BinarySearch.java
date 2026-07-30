public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        int n=arr.length;
        int target=9;
        int start=0;
        int end=n-1;
        int mid=((start+end)/2);
       while(start<=end){
           if(arr[mid]==target){
               System.out.println(mid);
                break;
           }
           else if(target<arr[mid]){
               end=mid-1;
           }
           else{
               start=mid+1;
           }
           mid=((start+end)/2);

       }

    }
}
