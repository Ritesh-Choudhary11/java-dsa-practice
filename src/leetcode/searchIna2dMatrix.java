package leetcode;

public class searchIna2dMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int totalrow = arr.length;
        int totalcol = arr[0].length;
        int n = totalrow * totalcol;
        int s = 0;
        int e = n - 1;
        int target=3;
        int  ans=0;
        while(s <= e) {
            int mid=(s+e)/2;
            int row=mid/totalcol;
            int col=mid%totalcol;
            if(arr[row][col]==target){
                ans=row;
                System.out.println("true");
                System.out.println(ans);

                break;
            }
            else if(arr[row][col]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }




        }

    }

}
