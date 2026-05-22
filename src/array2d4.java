import java.util.Scanner;
public class array2d4 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("entr no of row");
            int row= sc.nextInt();

            System.out.println("entr no of col");
            int col= sc.nextInt();

            int arr[][]=new int[row][col];
            //taking input
            System.out.println("enter the matrix element");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    arr[i][j]= sc.nextInt();
                }
            }
            // check matrix is square or not
            if(row!=col){
                System.out.println("the matrix is not symmatric");
                return;
            }
            boolean symmetric = true;
            // check transpose condition
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(arr[i][j]!=arr[j][i]){
                        //System.out.println("the matrix is not symmatric");
                        symmetric=false;
                    }
                }
            }
            if(symmetric==true){
                System.out.println("the matrix is symmetric");
            }
            else{
                System.out.println("the matrix is not symmatric");
            }
        }

}
