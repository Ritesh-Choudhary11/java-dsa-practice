import java.util.ArrayList;
import java.util.List;
public class Lecture33TwodArrayProblems {
    public static void main(String[] args) {
      List<Integer> result=new ArrayList<>();
      int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
      int n=arr.length;
      int m=arr[0].length;
      for(int col=0;col<m;col++){
          int sum=0;
          for(int row=0;row<n;row++){
              sum=sum+arr[row][col];
          }
          result.add(sum);
      }
        System.out.println(result);





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
