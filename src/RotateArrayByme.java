public class RotateArrayByme {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=3;
        int brr[]=new int[k];

        //OTHER SOLUTION DONE BY ME

        //coping is done
        for(int i=n-k,j=0;i<n;i++,j++){
            brr[j]=arr[i];
        }
        //now shifting
        for(int i=n-1-k,j=n-1;i>=0;j--,i--){
            arr[j]=arr[i];
        }
        // now i have to copy brr into arr
        for(int i=0;i<k;i++){
            arr[i]=brr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
