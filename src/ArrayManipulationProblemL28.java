public class ArrayManipulationProblemL28{
    public static void main(String[] args) {
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
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
for(int i=0;i<n;i++) {
    System.out.println(arr[i]);
}



    }
}
