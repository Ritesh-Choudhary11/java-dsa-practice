import java.util.ArrayList;
import java.util.List;

public class SpiralArrayPracLeet54 {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=arr.length;
        int m=arr[0].length;
        int strow=0;
        int endrow=n-1;
        int stcol=0;
        int endcol=m-1;
        while(strow<=endrow && stcol<=endcol){
            for(int col=stcol;col<=endcol;col++){
                result.add(arr[strow][col]);
            }
            strow++;
            for(int row=strow;row<=endrow;row++){
                result.add(arr[row][endcol]);
            }
            endcol--;
            for(int col=endcol;col>=stcol;col--){
                result.add(arr[endrow][col]);
            }
            endrow--;
             for(int row=endrow;row>=strow;row--){
                 result.add(arr[row][stcol]);
             }
             stcol++;
        }
        System.out.println(result);
    }
}
