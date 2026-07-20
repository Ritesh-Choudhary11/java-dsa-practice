public class Lecture33TwodArrayProblems {
    public static void main(String[] args) {

        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        //for original array
      int n=arr.length;
      int m=arr[0].length;

      //for new array
        int newRow=arr[0].length;
        int newCol = arr.length;
        int newarr[][]=new int[newRow][newCol];

      for(int row=0;row<n;row++){
          for(int col = 0; col<m; col++){
              newarr[col][row]=arr[row][col];
          }

      }
        for(int row = 0; row < newRow; row++) {
            for(int col = 0; col < newCol; col++) {
                System.out.print(newarr[row][col] + " ");
            }
            System.out.println();   // Move to the next line after one row
        }






//      List<Integer> result=new ArrayList<>();
//      int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//      int n=arr.length;
//      int m=arr[0].length;
//      for(int col=0;col<m;col++) {
//        if((col&1)==1){
//            for(int row=n-1;row>=0;row--){
//                result.add(arr[row][col]);
//            }
//        }
//        else{
//            for(int row=0;row<n;row++){
//                result.add(arr[row][col]);
//            }
//        }
//
//      }
//        System.out.println(result);




//      List<Integer> result=new ArrayList<>();
//      int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//      int n=arr.length;
//      int m=arr[0].length;
//      for(int col=0;col<m;col++){
//          int sum=0;
//          for(int row=0;row<n;row++){
//              sum=sum+arr[row][col];
//          }
//          result.add(sum);
//      }
//        System.out.println(result);





//      for(int row=0;row<n;row++) {
//          int sum=0;
//          for (int col =0; col <m; col++) {
//              sum=sum+arr[row][col];
//          }
//          result.add(sum);
//      }
//
//        System.out.println(result);

    }
}
