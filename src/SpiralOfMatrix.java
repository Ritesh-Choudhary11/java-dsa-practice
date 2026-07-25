import java.util.List;
import java.util.ArrayList;
public class SpiralOfMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
            int m=matrix.length;
            int n=matrix[0].length;
            List<Integer> result = new ArrayList<>();
            int StartingRow=0;
            int StartingCol=0;
            int EndingRow=m-1;
            int EndingCol=n-1;
            while(StartingRow<=EndingRow && StartingCol<=EndingCol){
                for(int col=StartingCol ; col<=EndingCol ; col++){
                    result.add(matrix[StartingRow][col]);
                }
                StartingRow++;

                for(int row=StartingRow ; row<=EndingRow ; row++){
                    result.add(matrix[row][EndingCol]);
                }
                EndingCol--;

                    for(int col=EndingCol ; col>=StartingCol ; col--){
                        result.add(matrix[EndingRow][col]);
                    }
                    EndingRow--;


                    for(int row=EndingRow ; row>=StartingRow ; row--){
                        result.add(matrix[row][StartingCol]);
                    }
                    StartingCol++;



            }
        System.out.println(result);
        }


    }

