public class ArrayManipulationProblemL28{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        for(int i=0,j=n-1;i<n;i++,j--){
            if( i==j){
                System.out.println(arr[i]);
                return;
            }
            else if(j>=i){
                System.out.println(arr[i]);
                System.out.println(arr[j]);
            }
        }
//        for (int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }







        //Q3 rotate array by k position
//        int k=3;
//        int arr[]={1,2,3,4,5,6,7};
//        int brr[]=new int[k];
//        int n=arr.length;
//        // first copy the element into brr.
//        for (int i=n-k,j=0; i<n ; i++,j++){
//            brr[j]=arr[i];
//        }
//
//        // element ko shift kar liya
//        for (int i=n-k-1;i>=0;i--){
//            arr[i+k]=arr[i];
//        }
// brr ko arr me copy kar diya
//        for( int i=0;i<k;i++){
//            arr[i]=brr[i];
//        }
// print kar diya
//       for(int i=0;i<n;i++){
//           System.out.println(arr[i]);
//       }







        //Q2 reverse array
//        int temp;
//        int arr[]={2,4,6,8,9};
//        int n= arr.length;
//        for(int i=0,j=n-1;i<=j;i++,j--){
//            temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//        }
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }

        //  Q1  rotate by 1 position
//        int arr[]={1,2,3,4,5,6};
//        int n=arr.length;
//        int temp=arr[n-1];
//        for(int i=n-1;i>0;i--){
//            arr[i]=arr[i-1];
//        }
//        arr[0]=temp;
//for(int i=0;i<n;i++) {
//    System.out.println(arr[i]);
//}



    }
}
