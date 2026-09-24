public class SearchInNearlySortedArray {
    public static void main(String[] args) {
        int arr[]={3,5,10,9,11};
        int k=10;
        int n= arr.length;
        int s=0;
        //int e;
        int ans=-1;
        int e=n-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(k==arr[mid]){
                ans=mid;
                break;
            }
             if(k==arr[mid-1]){
                ans=mid-1;
                break;
            }
             if(k==arr[mid+1]){
                ans=mid+1;
                break;
            }
             if(k>arr[mid]){
                 s=mid+1;
             }
             else{
                 e=mid-1;
             }


        }
        System.out.println(ans);




    }
}
