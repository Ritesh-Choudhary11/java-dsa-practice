package leetcode;

public class RotateArrayOrImage {
    public static void main(String[] args) {

        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int m=arr[0].length;

        //new array
        int newRow = arr[0].length;
        int newCol = arr.length;
        int newarray[][]=new int[newRow][newCol];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                newarray[j][n - 1 - i]=arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(newarray[i][j]);
            }
        }
    }
}
