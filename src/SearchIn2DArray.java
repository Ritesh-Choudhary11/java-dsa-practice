public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int totalrow=arr.length;
        int totalcol=arr[0].length;
        int target=3;
        int s=0;
        int n=totalrow*totalcol;
        int e=n-1;
        while(s<=e){
            int mid=(s+e)/2;
            int row=mid/totalcol;
            int col=mid%totalcol;
            if(arr[row][col]==target){
                System.out.println("element found");
                return;
            }
            else if(arr[row][col]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        System.out.println("element not found");
        return;
    }
}
