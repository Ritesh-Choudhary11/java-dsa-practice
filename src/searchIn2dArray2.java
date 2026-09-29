public class searchIn2dArray2 {
    public static void main(String[] args) {
        int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int totalrow=arr.length;
        int totalcol=arr[0].length;
            int target=5;
        int row=0;
        int col=totalcol-1;
        while(row<totalrow && col>=0){
            if(arr[row][col]==target){
                System.out.println(arr[row][col]);
            break;
            }
            else if(arr[row][col]<target){
                row++;


            }
            else{
                col--;
            }

        }
        //System.out.println("false");
    }
}
