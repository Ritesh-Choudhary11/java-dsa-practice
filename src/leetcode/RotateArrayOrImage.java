package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RotateArrayOrImage {
    public static void main(String[] args) {
        //List<Integer> result=new ArrayList<>();
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int m=arr[0].length;

        // transpose of a matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
            }
        }
//   for reversing the transpose matrix
        for(int i=0;i<n;i++){
            int left=0;
            for(int j=m-1;j>left;j--){
                int temp=arr[i][left];
                arr[i][left]=arr[i][j];
                arr[i][j]=temp;
                left++;
            }
        }




//     for reversing the transpose matrix (use this or the above one)

//        for(int i=0;i<n;i++){
//            int stcol=0;
//            int endcol=m-1;
//            while(stcol<=endcol){
//                int temp=arr[i][stcol];
//                arr[i][stcol]=arr[i][endcol];
//                arr[i][endcol]=temp;
//                stcol++;
//                endcol--;
//
//            }
//        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("  "+arr[i][j]);
            }
            System.out.println();
        }

    }
}
